package com.sahaf.Sahaf.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahaf.Sahaf.demo.dto.BookSellerDto;
import com.sahaf.Sahaf.demo.model.BookSeller;

@Repository
public interface BookSellerRepository extends JpaRepository<BookSeller,Integer>{

	void save(BookSellerDto bookSellerDto);
	
	
}
