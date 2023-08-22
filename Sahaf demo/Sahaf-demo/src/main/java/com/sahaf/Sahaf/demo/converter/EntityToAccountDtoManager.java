package com.sahaf.Sahaf.demo.converter;

import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.dto.AccountDto;
import com.sahaf.Sahaf.demo.model.Account;

@Service
public class EntityToAccountDtoManager implements EntityToAccountDtoService{

	@Override
	public AccountDto convert(Account source) {
		// TODO Auto-generated method stub
		AccountDto accountDto=new AccountDto();
		accountDto.setName(source.getName());
		accountDto.setSurname(source.getSurname());
		return accountDto;
	}

}
