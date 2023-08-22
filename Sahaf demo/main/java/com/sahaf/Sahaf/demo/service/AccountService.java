package com.sahaf.Sahaf.demo.service;

import java.util.List;

import com.sahaf.Sahaf.demo.dto.AccountDto;
import com.sahaf.Sahaf.demo.dto.CreateUserRequest;
import com.sahaf.Sahaf.demo.model.Account;

public interface AccountService {
	
	void addUser(Account user);
	AccountDto convertEntityToUserDto(Account user);
	List<AccountDto> getAllUsers();
	
	Account convertUserDtoEntity(CreateUserRequest createUserRequest);

}
