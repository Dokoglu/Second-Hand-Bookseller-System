package com.sahaf.Sahaf.demo.service;

import java.util.List;

import com.sahaf.Sahaf.demo.dto.BookSellerDto;
import com.sahaf.Sahaf.demo.dto.CreateBookSellerRequest;
import com.sahaf.Sahaf.demo.model.BookSeller;

public interface BookSellerService {
	
	void addBookSellerDto(BookSeller bookSeller);
	
	BookSellerDto fromEntityToDto(BookSeller bookSeller);
	BookSeller convertBookSellerDtoToBookSeller(CreateBookSellerRequest createBookSellerRequest);
	List<BookSellerDto> getAll();

}
