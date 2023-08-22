package com.sahaf.Sahaf.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahaf.Sahaf.demo.dto.BookSellerDto;
import com.sahaf.Sahaf.demo.dto.CreateBookSellerRequest;
import com.sahaf.Sahaf.demo.model.BookSeller;
import com.sahaf.Sahaf.demo.service.BookSellerService;

@RestController
@RequestMapping("/bookSeller")
public class BookSellerController {
	
	private final BookSellerService bookSellerService;

	public BookSellerController(BookSellerService bookSellerService) {
		this.bookSellerService = bookSellerService;
	}
	
	@PostMapping("/addBookSeller")
	public ResponseEntity<String> addBookSeller(@RequestBody CreateBookSellerRequest
			createBookSellerRequest) {
		BookSeller bookSeller=new BookSeller();
		
		bookSeller=bookSellerService.convertBookSellerDtoToBookSeller(createBookSellerRequest);
		bookSellerService.addBookSellerDto(bookSeller);
		return ResponseEntity.status(HttpStatus.CREATED).body("BookSeller added successfully");
	}
	
	@GetMapping("/getAllBookSeller")
	public List<BookSellerDto> getAll(){
	return bookSellerService.getAll();
	
	}
	

}
