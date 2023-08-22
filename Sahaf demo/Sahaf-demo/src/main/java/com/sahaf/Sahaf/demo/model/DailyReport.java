package com.sahaf.Sahaf.demo.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class DailyReport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Id")
	private int id;
	
	@Temporal(TemporalType.DATE)
	
	@Column(name="Date")
    private Date reportDate;
	
	@Column(name="numberOfBorrowedBooks")
	private int numberOfBorrowedBooks;
	
	@OneToMany(mappedBy="dailyReport")
	private List<BorrowedBook> borrowedBooks;

	public DailyReport(int id, Date reportDate, int numberOfBorrowedBooks
			,List<BorrowedBook> borrowedBooks) {
		this.id = id;
		this.reportDate = reportDate;
		this.numberOfBorrowedBooks = numberOfBorrowedBooks;
		this.borrowedBooks=borrowedBooks;
	}

	
	public DailyReport() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getReportDate() {
		return reportDate;
	}


	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}


	public int getNumberOfBorrowedBooks() {
		return numberOfBorrowedBooks;
	}

	public void setNumberOfBorrowedBooks(int numberOfBorrowedBooks) {
		this.numberOfBorrowedBooks = numberOfBorrowedBooks;
	}


	public List<BorrowedBook> getBorrowedBooks() {
		return borrowedBooks;
	}


	public void setBorrowedBooks(List<BorrowedBook> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
}
