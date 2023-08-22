package com.sahaf.Sahaf.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int bookSellerId;
	
	@OneToMany()
	private List<BorrowedBook> borrowedBooks;
	
	@ManyToOne
	@JoinColumn(name="Seller_Id")
	private BookSeller bookSeller;
	
	public Book(int id, String name, int bookSellerId, List<BorrowedBook> borrowedBooks) {
		
		this.id = id;
		this.name = name;
		this.bookSellerId=bookSellerId;
		this.borrowedBooks=borrowedBooks;
	}

	public Book() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBookSellerId() {
		return bookSellerId;
	}

	public void setBookSellerId(int bookSellerId) {
		this.bookSellerId = bookSellerId;
	}

	public List<BorrowedBook> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	
	
	
	

}
