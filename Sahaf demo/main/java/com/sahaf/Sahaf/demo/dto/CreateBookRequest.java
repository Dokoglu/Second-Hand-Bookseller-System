package com.sahaf.Sahaf.demo.dto;

public class CreateBookRequest {
	
	private String name;
	private int bookSellerId;
	
	public CreateBookRequest(String name,
			int bookSellerId) {
		this.name = name;
		this.bookSellerId=bookSellerId;
	}

	public CreateBookRequest() {
		
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
