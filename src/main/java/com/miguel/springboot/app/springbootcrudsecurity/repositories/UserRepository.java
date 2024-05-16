package com.miguel.springboot.app.springbootcrudsecurity.repositories;

import org.springframework.data.repository.CrudRepository;

import com.miguel.springboot.app.springbootcrudsecurity.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{
    
}
