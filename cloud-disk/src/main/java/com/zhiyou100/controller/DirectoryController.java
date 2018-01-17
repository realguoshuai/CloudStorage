package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.zhiyou100.entity.DirectoryDO;
import com.zhiyou100.service.DirectoryService;
import com.zhiyou100.vo.ResponseVO;

@RestController
public class DirectoryController {

	@Autowired
	private DirectoryService service;
	
	@RequestMapping("/directies/{directoryId}")
	public ResponseVO<List<DirectoryDO>> listDirectory(@PathVariable Long directoryId, @SessionAttribute Long accountId) {
		
		List<DirectoryDO> list;
		
		if (directoryId == 0) {
			
			list = service.listRootDirectory(accountId);
		}else {
			
			list = service.listDirectory(directoryId);
		}
		
		return new ResponseVO<List<DirectoryDO>>(list);
	}
	
	@RequestMapping(value = "/directies", method = RequestMethod.POST)
	public ResponseVO<DirectoryDO> createDirectory(DirectoryDO directoryDO) {
		
		directoryDO = service.addDirectory(directoryDO);
		
		return new ResponseVO<DirectoryDO>(directoryDO);
	}
	
	@RequestMapping(value = "/directies/name", method = RequestMethod.PUT)
	public ResponseVO<String> renameDirectory(@RequestBody DirectoryDO directoryDO) {
		
		service.renameDirectory(directoryDO);
		
		return new ResponseVO<String>("重命名成功");
	}
	
	@RequestMapping(value = "/directies/{directoryIds}", method = RequestMethod.DELETE)
	public ResponseVO<String> renameDirectory(@PathVariable String directoryIds) {
		
		service.removeDirectory(directoryIds);
		
		return new ResponseVO<String>("删除成功");
	}
}


