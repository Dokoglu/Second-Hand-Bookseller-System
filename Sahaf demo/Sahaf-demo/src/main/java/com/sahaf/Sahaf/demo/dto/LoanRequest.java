package com.sahaf.Sahaf.demo.dto;

import java.util.Date;

import com.sahaf.Sahaf.demo.model.Account;

public class LoanRequest {
	
	private int bookID;
	private Date dueDate;
	private Account user;
	private boolean approved;
	
	public LoanRequest(int bookID, Date dueDate, Account user,
			boolean approved) {
		this.bookID = bookID;
		this.dueDate = dueDate;
		this.user=user;
		this.approved=approved;
	}

	public LoanRequest() {
		
	}
	


	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date DueDate) {
		this.dueDate = dueDate;
	}

	public Account getUser() {
		return user;
	}

	public void setUser(Account user) {
		this.user = user;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	
	

}
