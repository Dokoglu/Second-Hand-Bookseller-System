package com.sahaf.Sahaf.demo.converter;

import org.modelmapper.Converters.Converter;

import com.sahaf.Sahaf.demo.dto.BookSellerDto;
import com.sahaf.Sahaf.demo.model.BookSeller;

public interface EntityToBookSellerDtoService extends Converter<BookSeller, BookSellerDto> {

}
