package com.miguel.springboot.app.springbootcrudsecurity.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.miguel.springboot.app.springbootcrudsecurity.entities.Role;

public interface RoleRepository extends CrudRepository <Role, Long>{
    
    Optional<Role> findByName(String name);

}
