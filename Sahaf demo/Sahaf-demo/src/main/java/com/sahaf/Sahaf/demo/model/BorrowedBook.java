package com.sahaf.Sahaf.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class BorrowedBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date deliveryDate;
	private Date loanDate;
	private int bookID;
	
	@OneToOne()
	@JoinColumn(name="assigned_user_ID")
	private Account assignedUser;

	@ManyToOne()
	@JoinColumn(name="book_id")
	private Book book;

	@ManyToOne()
	@JoinColumn(name="dailyReportId")
	private DailyReport dailyReport;
	
	public BorrowedBook(int id, Date deliveryDate,Date loanDate, Account assignedUser,
			int bookID) {
		this.id = id;
		this.deliveryDate = deliveryDate;
		this.loanDate=loanDate;
		this.assignedUser=assignedUser;
		this.bookID=bookID;
	}
	

	public BorrowedBook() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
