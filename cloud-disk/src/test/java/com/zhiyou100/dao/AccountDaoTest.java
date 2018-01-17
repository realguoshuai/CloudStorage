package com.zhiyou100.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.entity.AccountDO;

import junit.framework.TestCase;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class AccountDaoTest {

	@Autowired
	private AccountDao dao;
	
	@Test
	public void testGetAccountByEmail() {
		
		AccountDO accountDO = dao.getAccountByEmail("zhangsan@163.com");
		
		TestCase.assertNotNull(accountDO);
	}

	@Test
	public void testAddAccount() {
		
		AccountDO accountDO = new AccountDO("lisi@163.com", "123456");
		
		// 在 mapper 中配置 useGeneratedKeys="true" keyProperty="id"
		// 就可以把插入数据库后的 id 放入 accountDO 了
		int count = dao.addAccount(accountDO);
		
		TestCase.assertEquals(1, count);
	}

}
