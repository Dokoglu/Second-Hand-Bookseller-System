package com.sahaf.Sahaf.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahaf.Sahaf.demo.dto.BookDto;
import com.sahaf.Sahaf.demo.model.Book;
import com.sahaf.Sahaf.demo.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	
	@PostMapping("/addBook")
	public ResponseEntity<String> addBook(BookDto bookDto) {
		Book book=new Book();
		book=bookService.convertBookDtoToEntity(bookDto);
		bookService.addBook(book);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("Book added successfully");
	}
	
	

}
