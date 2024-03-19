package com.aroussi.demo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    public Optional<User> getUserById(Long id) {
        if (id == 1) {
            return Optional.of(new User(1L, "Adam Rs", "adam.rs@gmail.com"));
        }
        return Optional.empty();
    }

    public User createUser(User user) {
        return user;
    }
}
