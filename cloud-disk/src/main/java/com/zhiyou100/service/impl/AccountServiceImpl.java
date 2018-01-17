package com.zhiyou100.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.AccountDao;
import com.zhiyou100.entity.AccountDO;
import com.zhiyou100.exception.AccountExistsException;
import com.zhiyou100.exception.AccountNotExistsException;
import com.zhiyou100.exception.PasswordNotMatchException;
import com.zhiyou100.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao dao;
	
	public AccountDO login(String email, String password) {
		
		AccountDO accountDO = dao.getAccountByEmail(email);
		
		if (accountDO == null) {
			
			throw new AccountNotExistsException();
		}
		
		if (!accountDO.getPassword().equals(password)) {
			
			throw new PasswordNotMatchException();
		}
		
		return accountDO;
	}

	public AccountDO register(AccountDO accountDO) {

		int count = dao.addAccount(accountDO);
		
		if (count == 0) {
			
			throw new AccountExistsException();
		}
		
		return accountDO;
	}
}
