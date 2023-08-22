package com.sahaf.Sahaf.demo.dto;

public class BookDto {
	
	private String name;
	private int bookSellerId;
	
	public BookDto(String name, int bookSellerId) {
		this.name = name;
		this.bookSellerId = bookSellerId;
	}

	public BookDto() {
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
	
	

}
