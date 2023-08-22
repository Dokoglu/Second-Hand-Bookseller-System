package com.sahaf.Sahaf.demo.converter;

import org.springframework.core.convert.converter.Converter;

import com.sahaf.Sahaf.demo.dto.BorrowedBookDto;
import com.sahaf.Sahaf.demo.model.BorrowedBook;

public interface BorrowedBookDtoToEntityService extends Converter<BorrowedBookDto,BorrowedBook>{

}
