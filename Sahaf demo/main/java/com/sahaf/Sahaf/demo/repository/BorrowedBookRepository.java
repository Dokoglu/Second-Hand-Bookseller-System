package com.sahaf.Sahaf.demo.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahaf.Sahaf.demo.model.Book;
import com.sahaf.Sahaf.demo.model.BorrowedBook;

@Repository
public interface BorrowedBookRepository extends JpaRepository<BorrowedBook,Integer> {

	int countByBorrowDateBetween(Date startDate, Date endDate);

	Book save(Book book);

	

}
