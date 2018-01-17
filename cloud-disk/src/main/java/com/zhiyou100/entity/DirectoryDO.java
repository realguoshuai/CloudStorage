package com.zhiyou100.entity;

public class DirectoryDO {

	private Long id;
	
	private Long accountId;
	
	private String name;
	
	private Long parentId;
	
	private Boolean isFile;
	
	private Long fileId;

	public DirectoryDO() {
		super();
	}

	public DirectoryDO(Long id, Long parentId) {
		super();
		this.id = id;
		this.parentId = parentId;
	}

	public DirectoryDO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public DirectoryDO(Long accountId, String name, Long parentId, Boolean isFile, Long fileId) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.parentId = parentId;
		this.isFile = isFile;
		this.fileId = fileId;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Boolean getIsFile() {
		return isFile;
	}

	public void setIsFile(Boolean isFile) {
		this.isFile = isFile;
	}

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
}
