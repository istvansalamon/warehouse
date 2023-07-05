package service;

import database.UserDatabase;
import model.User;

import java.util.List;

public class UserService {
    private UserDatabase userDatabase;

    public UserService(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public void addUser(User user) {
        userDatabase.addUser(user);
    }

    public void updateUser(User updatedUser) {
        userDatabase.updateUser(updatedUser);
    }

    public void deleteUser(String username) {
        userDatabase.deleteUser(username);
    }

    public List<User> getUsers() {
        return userDatabase.getUsers();
    }
}
