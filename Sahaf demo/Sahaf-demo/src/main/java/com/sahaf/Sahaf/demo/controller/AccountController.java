package com.sahaf.Sahaf.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahaf.Sahaf.demo.dto.AccountDto;
import com.sahaf.Sahaf.demo.dto.CreateUserRequest;
import com.sahaf.Sahaf.demo.model.Account;
import com.sahaf.Sahaf.demo.service.AccountService;

@RestController
@RequestMapping("/users")
public class AccountController {
	
	private final AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@PostMapping("/addUserDto")
	
	public ResponseEntity<String> addUserDto(@RequestBody CreateUserRequest createUserRequest ) {
		Account account=accountService.convertUserDtoEntity(createUserRequest);
		 accountService.addUser(account); 
		 return ResponseEntity.status(HttpStatus.CREATED).body("User added successfully");
	}
	
	@GetMapping("/getAllUsers")
	public List<AccountDto> getAllUsers(){
		return accountService.getAllUsers();
		
	}

}
