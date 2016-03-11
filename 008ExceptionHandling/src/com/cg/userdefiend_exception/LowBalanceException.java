package com.cg.userdefiend_exception;

public class LowBalanceException extends Exception {
	private static final long serialVersionUID = 1547745284091615858L;
	private String message;
	public LowBalanceException() {
		message="Low Balance Exception";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LowBalanceException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String toString() {
		return "LowBalanceException [message=" + message + "]";
	}
}
