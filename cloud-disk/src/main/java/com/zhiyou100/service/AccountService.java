package com.zhiyou100.service;

import com.zhiyou100.entity.AccountDO;

public interface AccountService {

	/**
	 * 登录
	 * @param account 账号信息
	 * @return 登录成功的账号信息
	 */
	AccountDO login(String email, String password);
	
	/**
	 * 注册
	 * @param account 注册的账号
	 * @return 注册成功的账号信息
	 */
	AccountDO register(AccountDO account);
}






