package com.zhiyou100.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.DirectoryDao;
import com.zhiyou100.entity.DirectoryDO;
import com.zhiyou100.exception.DirectoryNameExistsException;
import com.zhiyou100.service.DirectoryService;

@Service
public class DirectoryServiceImpl implements DirectoryService {

	@Autowired
	private DirectoryDao dao;
	
	public List<DirectoryDO> listRootDirectory(Long accountId) {

		return dao.listRootDirectoryByAccountId(accountId);
	}

	public List<DirectoryDO> listDirectory(Long directoryId) {

		return dao.listDirectoryByDirectoryId(directoryId);
	}

	public DirectoryDO addDirectory(DirectoryDO directoryDO) {
		
		int count = dao.addDirectory(directoryDO);
		
		if (count == 0) {
			
			throw new DirectoryNameExistsException();
		}
		
		return directoryDO;
	}

	public void renameDirectory(DirectoryDO directoryDO) {

		int count = dao.updateDirectory(directoryDO);
		
		if (count == 0) {
			
			throw new DirectoryNameExistsException();
		}
	}

	public void removeDirectory(String directoryIds) {
		
		dao.removeDirectory(directoryIds.split(","));
	}

}
