package com.zhiyou100.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.entity.DirectoryDO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class DirectoryDaoTest {

	@Autowired
	private DirectoryDao dao;
	
	@Test
	public void testListRootDirectoryByAccountId() {

		List<DirectoryDO> list = dao.listRootDirectoryByAccountId(1L);
		
		TestCase.assertEquals(7, list.size());
	}

	@Test
	public void testListDirectoryByDirectoryId() {
		
		List<DirectoryDO> list = dao.listDirectoryByDirectoryId(1L);
		
		TestCase.assertEquals(3, list.size());
	}

	@Test
	public void testAddDirectory() {
	}

	@Test
	public void testUpdateDirectory() {
		
//		DirectoryDO directoryDO = new DirectoryDO(2L, 1L);
//		
//		int count = dao.updateDirectory(directoryDO);
//		
//		TestCase.assertEquals(1, count);
		
		
		DirectoryDO directoryDO = new DirectoryDO(3L, "qqq");
		
		int count = dao.updateDirectory(directoryDO);
		
		TestCase.assertEquals(0, count);
	}

	@Test
	public void testRemoveDirectory() {
		
		String[] ids = new String[]{"12", "13"};
		
		int count = dao.removeDirectory(ids);
		
		TestCase.assertEquals(2, count);
	}

}
