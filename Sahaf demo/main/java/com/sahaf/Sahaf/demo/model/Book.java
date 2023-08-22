package com.sahaf.Sahaf.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int bookSellerId;
	
	@OneToMany
	private List<BorrowedBook> borrowedBooks;
	
	@ManyToOne
	private BookSeller bookSeller;
	
	public Book(int id, String name, int bookSellerId, List<BorrowedBook> borrowedBooks) {
		
		this.id = id;
		this.name = name;
		this.bookSellerId=bookSellerId;
		this.borrowedBooks=borrowedBooks;
	}
}
