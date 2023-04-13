package com.fscc.loginservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.fscc.loginservice.data.LoginEntity;

public interface LoginRepository extends CrudRepository<LoginEntity, String> {
    
}