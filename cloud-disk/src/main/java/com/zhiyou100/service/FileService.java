package com.zhiyou100.service;

import org.springframework.web.multipart.MultipartFile;

import com.zhiyou100.entity.DirectoryDO;

public interface FileService {

	/**
	 * 上传文件 
	 * @param file 文件
	 * @param accountId 文件的主任
	 * @param directoryId 文件所在的目录
	 * @return 文件上传后的信息
	 */

	DirectoryDO upload(MultipartFile file, Long accountId, Long directoryId);
	
	/**
	 * 下载文件
	 * @param fileId 文件的 id
	 * @return 文件的二进制数据
	 */
	byte[] download(Long fileId);
}
