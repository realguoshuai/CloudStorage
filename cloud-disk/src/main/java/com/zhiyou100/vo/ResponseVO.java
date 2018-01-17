package com.zhiyou100.vo;

public class ResponseVO <T> {

	private int code;
	
	private String message;
	
	private T data;

	public ResponseVO() {
		super();
	}

	public ResponseVO(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ResponseVO(T data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseVO [code=" + code + ", message=" + message + ", data=" + data + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
