package com.fscc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fscc.entity.EmployeeEntity;
import com.fscc.repository.EmployeeRepository;

import java.util.Optional;

@Service

public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
        public EmployeeEntity getEmployee(Long id) throws Exception {
            return employeeRepository
                    .findById(id).orElseThrow(
                        () -> new Exception ("Employee not found"));
        }

    @Override
    public List<EmployeeEntity> getEmployees() {
        List<EmployeeEntity> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    @Override
    public Long addEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee).getId();
    }
}


