package com.sahaf.Sahaf.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.converter.EntityToBookSellerDtoService;
import com.sahaf.Sahaf.demo.dto.BookSellerDto;
import com.sahaf.Sahaf.demo.dto.CreateBookSellerRequest;
import com.sahaf.Sahaf.demo.model.BookSeller;
import com.sahaf.Sahaf.demo.repository.BookSellerRepository;

@Service
public class BookSellerManager implements BookSellerService{
	
	private final BookSellerRepository bookSellerRepository;
	private ModelMapper modelMapper;
	private EntityToBookSellerDtoService entityToBookSellerDtoService;

	public BookSellerManager(BookSellerRepository bookSellerRepository) {
		
		this.bookSellerRepository = bookSellerRepository;
	}


	@Override
	public void addBookSellerDto(BookSeller bookSeller) {
		// TODO Auto-generated method stub
		
		this.bookSellerRepository.save(bookSeller);
		
	}


	public BookSellerDto fromEntityToDto(BookSeller bookSeller) {
		// TODO Auto-generated method stub
		BookSellerDto bookSellerDto=new BookSellerDto();
		bookSellerDto=entityToBookSellerDtoService.convert(bookSeller);
		return bookSellerDto;
	}


	@Override
	public BookSeller convertBookSellerDtoToBookSeller
	(CreateBookSellerRequest createBookSellerRequest) {
		// TODO Auto-generated method stub
		modelMapper.getConfiguration()
        .setMatchingStrategy(MatchingStrategies.STANDARD);
		BookSeller bookSeller=new BookSeller();
		bookSeller=modelMapper.map(createBookSellerRequest, BookSeller.class);
		
		return bookSeller;
	}


	@Override
	public List<BookSellerDto> getAll() {
		// TODO Auto-generated method stub
		
		return bookSellerRepository.findAll()
				.stream()
				.map(this::fromEntityToDto)
				.collect(Collectors.toList());
	}
	


		

	
}
