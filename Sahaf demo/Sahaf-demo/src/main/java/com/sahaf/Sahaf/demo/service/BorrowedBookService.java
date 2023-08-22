package com.sahaf.Sahaf.demo.service;

import java.util.Date;

import com.sahaf.Sahaf.demo.dto.BorrowedBookDto;
import com.sahaf.Sahaf.demo.dto.LoanRequest;
import com.sahaf.Sahaf.demo.model.Book;
import com.sahaf.Sahaf.demo.model.BorrowedBook;

public interface BorrowedBookService {

	Book save(Book book);
	int countBorrowedBooksForDate(Date date);
	BorrowedBook loanBook(LoanRequest loanRequest) throws Exception;
	
	BorrowedBook convertBorrowedBookDtoToBorrowedBook(BorrowedBookDto borrowedBookDto);
	BorrowedBook findByID(int id);
}
