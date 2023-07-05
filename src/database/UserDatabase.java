package database;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<User> users;

    public UserDatabase() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(User updatedUser) {
        for (User user : users) {
            if (user.getUsername().equals(updatedUser.getUsername())) {
                user.setPassword(updatedUser.getPassword());
                break;
            }
        }
    }

    public void deleteUser(String username) {
        User userToRemove = null;
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            users.remove(userToRemove);
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
