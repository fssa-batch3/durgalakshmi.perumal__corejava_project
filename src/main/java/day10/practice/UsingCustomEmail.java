package day10.practice;

import java.util.ArrayList;
import java.util.Collections;

 class UsingCustomemail {
	
	private String email;


	public UsingCustomemail(String email2) {
		// TODO Auto-generated constructor stub
	}

	public void mail(String email) {
		
		this.email = email;
	
	}

	public String getemail() {
		return email;
	}

	public void setName(String email) {
		this.email = email;
	}


}

 class EmailValidator {
	    public static boolean isValidEmail(String emailId) throws InvalidEmailException {
	        if (emailId == null || !emailId.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
	            throw new InvalidEmailException("Invalid email format: " + emailId);
	        }
	        return true;
	    }
	}
 class InvalidEmailException extends Exception {
	    public InvalidEmailException(String message) {
	        super(message);
	    }
	}


