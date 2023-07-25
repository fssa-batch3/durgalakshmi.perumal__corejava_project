package day10.practice;

import java.util.ArrayList;

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserManagerApp {
    int id;
    String name;
    String emailId;

    public UserManagerApp(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
}

class UserManager {
    private ArrayList<UserManagerApp> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void register(UserManagerApp user) throws UserAlreadyExistsException {
        for (UserManagerApp existingUser : userList) {
            if (existingUser.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User with emailId " + user.emailId + " already exists.");
            }
        }

        // If the user does not exist with the same emailId, add the user to the userList.
        userList.add(user);
    }

    // Other methods for managing users can be added here if needed.
}

public class UserManagerApp {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        try {
            UserManagerApp user1 = new UserManagerApp(1, "John Doe", "john@example.com");
            userManager.register(user1);

            UserManagerApp user2 = new UserManagerApp(2, "Jane Smith", "jane@example.com");
            userManager.register(user2);

            UserManagerApp user3 = new UserManagerApp(3, "Alice Johnson", "john@example.com"); // This user will throw an exception.
            userManager.register(user3);
        } catch (UserAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


