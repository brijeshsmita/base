package com.cg.synchronization;

public class LowBalanceException extends Exception {
	String message;
	LowBalanceException(){
		message="Insufficient Balance !";
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
