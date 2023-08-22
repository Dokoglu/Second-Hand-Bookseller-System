package com.sahaf.Sahaf.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sahaf.Sahaf.demo.dto.AccountDto;
import com.sahaf.Sahaf.demo.model.Account;

@Repository
public interface UserRepository extends JpaRepository<Account,Integer> {

	void save(AccountDto userDto);

}
