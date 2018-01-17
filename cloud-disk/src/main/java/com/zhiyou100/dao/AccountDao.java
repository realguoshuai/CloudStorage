package com.zhiyou100.dao;

import com.zhiyou100.entity.AccountDO;

public interface AccountDao {

	/**
	 * 根据邮箱获取账号信息
	 * @param email 邮箱
	 * @return 账号信息
	 */
	AccountDO getAccountByEmail(String email);
	
	/**
	 * 向数据库插入账号信息
	 * @param accountDO 账号信息
	 * @return 插入的行数
	 */
	int addAccount(AccountDO accountDO);
}
