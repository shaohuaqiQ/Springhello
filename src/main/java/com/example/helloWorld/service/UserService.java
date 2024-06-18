package com.example.helloWorld.service;

import com.example.helloWorld.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User createUser(User user);
    void deleteUser(Long id);
}
