package com.sahaf.Sahaf.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.sahaf.Sahaf.demo.converter.EntityToAccountDtoService;
import com.sahaf.Sahaf.demo.dto.AccountDto;
import com.sahaf.Sahaf.demo.dto.CreateUserRequest;
import com.sahaf.Sahaf.demo.model.Account;
import com.sahaf.Sahaf.demo.repository.UserRepository;

@Service
public class AccountManager implements AccountService{
	
	private final UserRepository userRepository;
	private ModelMapper modelMapper;
	private EntityToAccountDtoService entityToAccountDtoService;

	public AccountManager(UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}

	@Override
	public void addUser(Account user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
	}

	
	public AccountDto convertEntityToUserDto(Account user) {
		// TODO Auto-generated method stub
		 AccountDto userDto = new AccountDto();
		 userDto = entityToAccountDtoService.convert(user);
		 return userDto;
		
	}

	@Override
	public List<AccountDto> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll()
				.stream()
				.map(this::convertEntityToUserDto)
				.collect(Collectors.toList());
	}

	@Override
	public Account convertUserDtoEntity(CreateUserRequest createUserReqeust) {
		// TODO Auto-generated method stub
		Account user=new Account();
		user=modelMapper.map(createUserReqeust, Account.class);
		return user;
	}

}
