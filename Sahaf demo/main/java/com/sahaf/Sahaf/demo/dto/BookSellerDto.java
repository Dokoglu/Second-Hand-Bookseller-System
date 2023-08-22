package com.sahaf.Sahaf.demo.dto;

public class BookSellerDto {

	private String name;
	private String surname;
	private int bookID;
	
	public BookSellerDto(String name, String surname, int bookID) {
		this.name = name;
		this.surname = surname;
		this.bookID = bookID;
	}

	public BookSellerDto() {
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

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	
	
	
}
