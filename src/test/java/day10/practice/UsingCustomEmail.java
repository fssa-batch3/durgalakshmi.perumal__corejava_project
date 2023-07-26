package day10.practice;

public class UsingCustomEmail {

	 public static void main(String[] args) {
	        String email = "john@example.com";

	        try {
	            EmailValidator.isValidEmail(email);
	            UsingCustomemail user = new UsingCustomemail(email);
	            System.out.println("Email: " + user.getemail());
	        } catch (InvalidEmailException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }	
}
