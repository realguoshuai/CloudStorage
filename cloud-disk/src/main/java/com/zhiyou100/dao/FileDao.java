package com.zhiyou100.dao;

import com.zhiyou100.entity.FileDO;

public interface FileDao {

	/**
	 * 添加一个文件信息
	 * @param fileDO 文件信息
	 * @return 添加的行数
	 */
	int addFile(FileDO fileDO);
	
	/**
	 * 根据文件 id 获取文件的保存路径
	 * @param fileId 文件 id
	 * @return 文件的保存路径
	 */
	String getFilePathById(Long fileId);
}
