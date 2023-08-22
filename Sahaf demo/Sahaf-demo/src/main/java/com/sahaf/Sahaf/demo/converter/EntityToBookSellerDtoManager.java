package com.sahaf.Sahaf.demo.converter;

import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.dto.BookSellerDto;
import com.sahaf.Sahaf.demo.model.BookSeller;

@Service

public class EntityToBookSellerDtoManager implements EntityToBookSellerDtoService {
	

	@Override
	public BookSellerDto convert(BookSeller source) {
		// TODO Auto-generated method stub
		BookSellerDto bookSellerDto=new BookSellerDto();
		bookSellerDto.setName(source.getName());
		bookSellerDto.setSurname(source.getSurname());
		bookSellerDto.setBookID(source.getBookID());
		return bookSellerDto;
	}


	

}
