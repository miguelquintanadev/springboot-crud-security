package com.miguel.springboot.app.springbootcrudsecurity.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.miguel.springboot.app.springbootcrudsecurity.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    boolean existsByUsername(String username);

    Optional<User> findByUsername(String username);

}
