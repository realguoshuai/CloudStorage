package com.zhiyou100.controller;

import java.io.FileInputStream;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.zhiyou100.entity.DirectoryDO;
import com.zhiyou100.service.FileService;
import com.zhiyou100.vo.ResponseVO;

@RestController
public class FileController {

	@Autowired
	private FileService service;
	
	@RequestMapping(value = "/files", method = RequestMethod.POST)
	public ResponseVO<DirectoryDO> uploadFile(MultipartFile file, Long directoryId, @SessionAttribute Long accountId) {
		
		DirectoryDO directoryDO = service.upload(file, accountId, directoryId);
		
		return new ResponseVO<>(directoryDO);
	}
	
	@RequestMapping("/file/{fileId}/{fileName}")
	public ResponseEntity<byte[]> downloadFile(@PathVariable Long fileId, @PathVariable String fileName) {

		byte[] body = service.download(fileId);
		
	    HttpHeaders headers = new HttpHeaders();
	    
	    headers.add("Content-Disposition", "attchement;filename=" + fileName);
	    
	    HttpStatus statusCode = HttpStatus.OK;
	    
	    ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body, headers, statusCode);
	    
	    return entity;
	}
}
