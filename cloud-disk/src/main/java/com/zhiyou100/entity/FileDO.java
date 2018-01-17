package com.zhiyou100.entity;

public class FileDO {

	private Long id;
	
	private String name;
	
	private String path;

	public FileDO() {
		super();
	}
	
	public FileDO(String name, String path) {
		super();
		this.name = name;
		this.path = path;
	}

	@Override
	public String toString() {
		return "File [id=" + id + ", name=" + name + ", path=" + path + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
