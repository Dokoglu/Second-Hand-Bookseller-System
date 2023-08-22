package com.sahaf.Sahaf.demo.converter;

import org.springframework.core.convert.converter.Converter;

import com.sahaf.Sahaf.demo.dto.AccountDto;
import com.sahaf.Sahaf.demo.model.Account;

public interface EntityToAccountDtoService extends Converter<Account, AccountDto> {

}
