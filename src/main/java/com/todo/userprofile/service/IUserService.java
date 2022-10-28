package com.todo.userprofile.service;

import com.todo.userprofile.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<User> getAllUsers();
    void createUser(User user);
    Optional<User> getUserById(Long id);

    User updateUser(User user);
    void deleteUserById(Long id);


}
