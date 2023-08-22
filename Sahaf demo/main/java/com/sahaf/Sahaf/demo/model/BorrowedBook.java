package com.sahaf.Sahaf.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BorrowedBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date deliveryDate;
	private Date loanDate;
	@ManyToOne
	private Account assignedUser;
	private int bookID;
	

	@ManyToOne
	private Book book;

	@ManyToOne
	private DailyReport dailyReport;
	
	@ManyToOne
	private Account user;
	
	public BorrowedBook(int id, Date deliveryDate,Date loanDate, Account assignedUser,
			int bookID) {
		this.id = id;
		this.deliveryDate = deliveryDate;
		this.loanDate=loanDate;
		this.assignedUser=assignedUser;
		this.bookID=bookID;
	}
}
