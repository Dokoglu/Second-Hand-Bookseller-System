package com.sahaf.Sahaf.demo.dto;

import java.util.Date;

import com.sahaf.Sahaf.demo.model.Account;

public class BorrowedBookDto {
	
	private Date deliveryDate;
	private Date loanDate;
	private Account assignedUser;
	private int bookID;
	
	public BorrowedBookDto(Date deliveryDate, Date loanDate, Account assignedUser, int bookID) {
		this.deliveryDate = deliveryDate;
		this.loanDate = loanDate;
		this.assignedUser = assignedUser;
		this.bookID = bookID;
	}
	public BorrowedBookDto() {
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	public Account getAssignedUser() {
		return assignedUser;
	}
	public void setAssignedUser(Account assignedUser) {
		this.assignedUser = assignedUser;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	
	
	

}
