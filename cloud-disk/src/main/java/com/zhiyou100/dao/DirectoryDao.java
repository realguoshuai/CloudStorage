package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.entity.DirectoryDO;

public interface DirectoryDao {

	/**
	 * 根据账号 id 查询根目录信息
	 * @param accountId 账号 id
	 * @return 根目录下的所有数据
	 */
	List<DirectoryDO> listRootDirectoryByAccountId(Long accountId);
	
	/**
	 * 查询普通目录下的信息
	 * @param directoryId 普通目录 id
	 * @return 普通目录下的所有数据
	 */
	List<DirectoryDO> listDirectoryByDirectoryId(Long directoryId);
	
	/**
	 * 向数据库中插入一条目录信息
	 * @param directoryDO 目录信息
	 * @return 插入的行数
	 */
	int addDirectory(DirectoryDO directoryDO);
	
	/**
	 * 更新一条目录信息
	 * @param directoryDO 目录信息
	 * @return 更新的行数
	 */
	int updateDirectory(DirectoryDO directoryDO);
	
	/**
	 * 批量删除目录信息
	 * @param directoryId
	 * @return 删除的行数
	 */
	int removeDirectory(String[] ids);
}







