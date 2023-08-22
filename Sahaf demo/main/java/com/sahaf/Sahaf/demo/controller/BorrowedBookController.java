package com.sahaf.Sahaf.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahaf.Sahaf.demo.dto.BorrowedBookDto;
import com.sahaf.Sahaf.demo.model.BorrowedBook;
import com.sahaf.Sahaf.demo.service.BorrowedBookService;

@RestController
@RequestMapping("/borrowedBook")
public class BorrowedBookController {
	
	private final BorrowedBookService borrowedBookService;

	public BorrowedBookController(BorrowedBookService borrowedBookService) {
		this.borrowedBookService = borrowedBookService;
	}
	
	@PostMapping("/loanBook")
	public  ResponseEntity<String> addloanBook(@RequestBody BorrowedBookDto borrowedBookDto){
		BorrowedBook borrowedBook=new BorrowedBook();
		borrowedBook=borrowedBookService.convertBorrowedBookDtoToBorrowedBook(borrowedBookDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(" Loan transaction added successfully");
		
	}
	

}
