package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.entity.DirectoryDO;

public interface DirectoryService {

	/**
	 * 查看根目录
	 * @param accountId 用户 id
	 * @return 根目录的内容
	 */
	List<DirectoryDO> listRootDirectory(Long accountId);
	
	/**
	 * 查看指定目录
	 * @param parentId 父目录 id
	 * @return 目录下的内容
	 */
	List<DirectoryDO> listDirectory(Long parentId);
	
	// 获取所有的文件夹

	/**
	 * 新建目录下文件夹
	 * @param directoryDO 文件夹信息
	 * @return
	 */
	DirectoryDO addDirectory(DirectoryDO directoryDO);
	
	/**
	 * 重命名
	 * @param directoryId 文件夹 id
	 * @param newDirectoryName 新名字
	 */
	void renameDirectory(DirectoryDO directoryDO);
	
	/**
	 * 批量删除文件夹
	 * @param directoryIds 文件夹 id 列表
	 */
	void removeDirectory(String directoryIds);
}






