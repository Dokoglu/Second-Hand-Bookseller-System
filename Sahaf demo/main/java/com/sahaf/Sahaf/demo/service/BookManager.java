package com.sahaf.Sahaf.demo.service;


import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.dto.BookDto;
import com.sahaf.Sahaf.demo.dto.CreateBookRequest;
import com.sahaf.Sahaf.demo.model.Book;
import com.sahaf.Sahaf.demo.model.BorrowedBook;
import com.sahaf.Sahaf.demo.repository.BookRepository;

@Service
public class BookManager implements BookService{
	
	private final BookRepository bookRepository;
	private final BookService bookService;
	private ModelMapper modelMapper;
	
	public BookManager(BookRepository bookRepository,
			BookService bookService) {
		this.bookRepository = bookRepository;
		
		this.bookService=bookService;
	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
		this.bookRepository.save(book);
		
	}

	@Override
	public BorrowedBook findByName(String name) {
		// TODO Auto-generated method stub
		return bookService.findByName(name);
	}

	@Override
	public BookDto convertEntityToBookDto(Book book) {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration()
        .setMatchingStrategy(MatchingStrategies.STANDARD);
		BookDto bookDto=new BookDto();
		bookDto=modelMapper.map(book, BookDto.class);
		return bookDto;
	}

	@Override
	public Book convertBookDtoToEntity(BookDto bookDto) {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration()
        .setMatchingStrategy(MatchingStrategies.STANDARD);
		Book book=new Book();
		book=modelMapper.map(bookDto, Book.class);
		return book;
	}

	@Override
	public Optional<Book> findByID(int id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}



	

}
