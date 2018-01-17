package com.zhiyou100.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhiyou100.entity.FileDO;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class FileDaoTest {

	@Autowired
	private FileDao dao;
	
	@Test
	public void testAddFile() {
		
		FileDO fileDO = new FileDO("1.txt", "/aaa/bbb/ccc");
		
		int count = dao.addFile(fileDO);
		
		TestCase.assertEquals(0, count);
	}

	@Test
	public void testGetFilePathById() {
		
		String path = dao.getFilePathById(1L);
		
		TestCase.assertEquals("/aaa", path);
	}
}
