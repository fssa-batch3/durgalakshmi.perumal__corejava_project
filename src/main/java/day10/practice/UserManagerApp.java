package day10.practice;

import java.util.ArrayList;

class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class User {
    int id;
    String name;
    String emailId;

    public User(int id, String name, String emailId) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
    }
}

class UserManager {
    private ArrayList<User> userList;

    public UserManager() {
        userList = new ArrayList<>();
    }

    public void register(User user) throws UserAlreadyExistsException {
        for (User existingUser : userList) {
            if (existingUser.emailId.equals(user.emailId)) {
                throw new UserAlreadyExistsException("User with emailId " + user.emailId + " already exists.");
            }
        }

        userList.add(user);
    }

}




