package com.cg.exception;

public class BankException extends Exception {
	
	private String message;
	private static final long serialVersionUID = -5747133303192376267L;

	public BankException(String msg){
		super();
		
		this.message=msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
