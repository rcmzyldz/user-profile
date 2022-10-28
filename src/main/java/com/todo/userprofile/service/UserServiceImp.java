package com.todo.userprofile.service;

import com.todo.userprofile.model.User;
import com.todo.userprofile.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements IUserService{


    private final IUserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUserById(Long id) {
        this.userRepository.deleteById(id);
    }
}
