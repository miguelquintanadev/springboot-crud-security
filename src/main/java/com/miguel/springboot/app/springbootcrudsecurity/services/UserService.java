package com.miguel.springboot.app.springbootcrudsecurity.services;

import java.util.List;

import com.miguel.springboot.app.springbootcrudsecurity.entities.User;

public interface UserService {
    
    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
