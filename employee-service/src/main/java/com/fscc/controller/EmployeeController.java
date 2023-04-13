package com.fscc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fscc.entity.EmployeeEntity;
import com.fscc.service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<List<EmployeeEntity>> getEmployees(){
        List<EmployeeEntity> employees = employeeService.getEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeEntity> getEmployee(@PathVariable Long id) throws Exception{
        EmployeeEntity employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> addEmployee(@RequestBody EmployeeEntity employee){
        long returnedId = employeeService.addEmployee(employee);
        String message = "Added employee with id of: "+ returnedId;
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

}
