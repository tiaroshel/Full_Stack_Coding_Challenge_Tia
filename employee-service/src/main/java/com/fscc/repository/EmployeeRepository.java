package com.fscc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.fscc.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {

    List<EmployeeEntity> findByOrderByLastName();

    Optional<EmployeeEntity> findByEmail(String email);
    
}    
