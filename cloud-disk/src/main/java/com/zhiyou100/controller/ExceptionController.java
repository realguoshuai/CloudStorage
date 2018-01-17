package com.zhiyou100.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.zhiyou100.exception.AccountExistsException;
import com.zhiyou100.exception.AccountNotExistsException;
import com.zhiyou100.exception.DirectoryNameExistsException;
import com.zhiyou100.exception.DownloadFileException;
import com.zhiyou100.exception.PasswordNotMatchException;
import com.zhiyou100.exception.UploadFileException;
import com.zhiyou100.vo.ResponseVO;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(AccountNotExistsException.class)
	public ResponseVO<String> handlerAccountNotExistsException() {
		
		return new ResponseVO<>(-1, "账号不存在");
	}
	
	@ExceptionHandler(PasswordNotMatchException.class)
	public ResponseVO<String> handlerPasswordNotMatchException() {
		
		return new ResponseVO<>(-2, "密码错误");
	}
	
	@ExceptionHandler(AccountExistsException.class)
	public ResponseVO<String> handlerAccountExistsException() {
		
		return new ResponseVO<>(-3, "账号已存在");
	}
	
	@ExceptionHandler(DirectoryNameExistsException.class)
	public ResponseVO<String> handlerDirectoryNameExistsException() {
		
		return new ResponseVO<>(-4, "已存在同名的文件");
	}
	
	@ExceptionHandler(UploadFileException.class)
	public ResponseVO<String> handlerUploadFileException() {
		
		return new ResponseVO<>(-5, "上传失败");
	}
	
	@ExceptionHandler(DownloadFileException.class)
	public ResponseVO<String> handlerDownloadFileException() {
		
		return new ResponseVO<>(-6, "下载失败");
	}
}
