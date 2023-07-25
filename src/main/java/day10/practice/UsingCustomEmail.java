package day10.practice;

import java.util.ArrayList;
import java.util.Collections;

 class UsingCustomemail {
	
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

class EmailValidator  {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new InvalidEmailException("Invalid email format: " + email);
        }
        return true;
	}
	}
public class UsingCustomEmail {
    public static void main(String[] args) {

}}