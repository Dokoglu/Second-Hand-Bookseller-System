package com.sahaf.Sahaf.demo.converter;

import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.dto.BorrowedBookDto;
import com.sahaf.Sahaf.demo.model.BorrowedBook;

@Service
public class BorrowedBookDtoToEntityManager implements BorrowedBookDtoToEntityService  {

	@Override
	public BorrowedBook convert(BorrowedBookDto source) {
		// TODO Auto-generated method stub
		BorrowedBook borrowedBook=new BorrowedBook();
		borrowedBook.setLoanDate(source.getLoanDate());
		borrowedBook.setAssignedUser(source.getAssignedUser());
		borrowedBook.setBookID(source.getBookID());
		borrowedBook.setDeliveryDate(source.getDeliveryDate());
		return borrowedBook;
	}
	

}
