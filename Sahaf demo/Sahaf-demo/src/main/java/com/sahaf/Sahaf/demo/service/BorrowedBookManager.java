package com.sahaf.Sahaf.demo.service;

import java.util.Calendar;
import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.converter.BorrowedBookDtoToEntityService;
import com.sahaf.Sahaf.demo.dto.BorrowedBookDto;
import com.sahaf.Sahaf.demo.dto.LoanRequest;
import com.sahaf.Sahaf.demo.model.Book;
import com.sahaf.Sahaf.demo.model.BorrowedBook;
import com.sahaf.Sahaf.demo.repository.BorrowedBookRepository;

@Service
public class BorrowedBookManager implements BorrowedBookService{
	
	private final BorrowedBookRepository borrowedBookRepository;
	private final BorrowedBookDtoToEntityService borrowedBookDtoToEntityService;
	private final ModelMapper modelMapper;
	private final BookService bookService;
	
	public BorrowedBookManager(BorrowedBookRepository borrowedBookRepository,
		BorrowedBookDtoToEntityService borrowedBookDtoToEntityService,
			ModelMapper modelMapper, BookService bookService) {
		this.borrowedBookRepository = borrowedBookRepository;
		this.borrowedBookDtoToEntityService=borrowedBookDtoToEntityService;
		this.modelMapper=modelMapper;
		this.bookService=bookService;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return borrowedBookRepository.save(book);
	}

	@Override
	public int countBorrowedBooksForDate(Date date) {
		// TODO Auto-generated method stub
		 Calendar calendar = Calendar.getInstance();
		    calendar.setTime(date);
		    calendar.set(Calendar.HOUR_OF_DAY, 0);
		    calendar.set(Calendar.MINUTE, 0);
		    calendar.set(Calendar.SECOND, 0);

		    Date startDate = calendar.getTime();

		    calendar.add(Calendar.DAY_OF_MONTH, 1);
		    Date endDate = calendar.getTime();

		    return borrowedBookRepository.countByLoanDateBetween(startDate, endDate);
		
	}

	@Override
	public BorrowedBook loanBook(LoanRequest loanRequest) throws Exception {
		// TODO Auto-generated method stub
			
		int bookId = loanRequest.getBookID();
		 Book book = bookService.findByID(bookId)
	                .orElseThrow(() -> new Exception("Book not found"));
		 BorrowedBook borrowedBook=new BorrowedBook();
		 borrowedBook=modelMapper.map(book, BorrowedBook.class);
		 if (loanRequest.isApproved()) {
		 borrowedBook.setAssignedUser(loanRequest.getUser()); // loanRequest.getUser() kullanıcının bilgisini temsil eder
			    
			}
		 
			return  borrowedBookRepository.save(borrowedBook);
	}

	@Override
	public BorrowedBook convertBorrowedBookDtoToBorrowedBook(BorrowedBookDto borrowedBookDto) {
		// TODO Auto-generated method stub
		BorrowedBook borrowedBook=borrowedBookDtoToEntityService.convert(borrowedBookDto);
		return borrowedBook;
	}

	@Override
	public BorrowedBook findByID(int id) {
		// TODO Auto-generated method stub
		return borrowedBookRepository.findById(id).get();
	}

	
	
}
