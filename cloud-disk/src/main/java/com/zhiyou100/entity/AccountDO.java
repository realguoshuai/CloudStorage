package com.zhiyou100.entity;

public class AccountDO {

	private Long id;
	
	private String email;
	
	private String password;

	public AccountDO() {
		super();
	}
	
	public AccountDO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
