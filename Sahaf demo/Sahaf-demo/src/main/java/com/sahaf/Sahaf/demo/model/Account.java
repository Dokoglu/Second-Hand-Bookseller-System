package com.sahaf.Sahaf.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="account_user")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name="account_name")
	private String name;
	
	
	private String surname;

	@OneToOne()
	@JoinColumn(name="borrowedBook_ID")
	private BorrowedBook borrowedBooks;
	

	public Account(int id, String name, String surname, BorrowedBook borrowedBooks) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.borrowedBooks = borrowedBooks;
	}

	public Account() {
		
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public BorrowedBook getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(BorrowedBook borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	
	
	

}
