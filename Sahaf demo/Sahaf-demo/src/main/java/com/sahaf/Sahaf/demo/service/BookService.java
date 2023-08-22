package com.sahaf.Sahaf.demo.service;

import java.util.Optional;

import com.sahaf.Sahaf.demo.dto.BookDto;
import com.sahaf.Sahaf.demo.model.Book;

public interface BookService {
	
	void addBook(Book book);
	
	BookDto convertEntityToBookDto(Book book);
	
	Book convertBookDtoToEntity(BookDto bookDto);
	Optional<Book> findByID(int id);
	
	

}
