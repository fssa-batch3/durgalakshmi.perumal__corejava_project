package day10.practice;

import java.util.ArrayList;
import java.util.Collections;


public class UsingCustomEmail {
	
	private String email;


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

public class EmailValidator  {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new InvalidEmailException("Invalid email format: " + email);
        }
        return true;
	}
	}

