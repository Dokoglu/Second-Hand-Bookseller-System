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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DailyReport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
    private Date reportDate;
	
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
}
