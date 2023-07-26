package day10.practice;

public class UserManagerApp {
	 public static void main(String[] args) {
	        UserManager userManager = new UserManager();

	        try {
	            User user1 = new User(1, "John Doe", "john@example.com");
	            userManager.register(user1);

	            User user2 = new User(2, "Jane Smith", "jane@example.com");
	            userManager.register(user2);

	            User user3 = new User(3, "Alice Johnson", "john@example.com"); 
	            userManager.register(user3);
	        } catch (UserAlreadyExistsException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
