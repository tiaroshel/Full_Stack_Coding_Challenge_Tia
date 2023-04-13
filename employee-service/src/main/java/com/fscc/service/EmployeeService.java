package com.fscc.service;

import java.util.List;

import com.fscc.entity.EmployeeEntity;

public interface EmployeeService {
    
    EmployeeEntity getEmployee(Long id) throws Exception;

    List<EmployeeEntity> getEmployees();

    Long addEmployee(EmployeeEntity employee);
}

