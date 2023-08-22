package com.sahaf.Sahaf.demo.converter;

import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.dto.AccountDto;
import com.sahaf.Sahaf.demo.model.Account;
import com.sahaf.Sahaf.demo.service.AccountService;

@Service
public class EntityToAccountDtoManager implements EntityToAccountDtoService{

	private final AccountService accountService;
	
	
	public EntityToAccountDtoManager(AccountService accountService) {
		super();
		this.accountService = accountService;
	}


	@Override
	public AccountDto convert(Account source) {
		// TODO Auto-generated method stub
		AccountDto accountDto=new AccountDto();
		accountDto.setName(source.getName());
		accountDto.setSurname(source.getSurname());
		return accountDto;
	}

}
