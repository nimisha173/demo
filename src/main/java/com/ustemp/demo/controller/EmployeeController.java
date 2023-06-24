package com.ustemp.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustemp.demo.model.Employee;
import com.ustemp.demo.service.EmployeeService;

@RestController
@RequestMapping("/registration")
@CrossOrigin("*")
public class EmployeeController {
	
	
	    @Autowired
		private EmployeeService employeeService;
	    
	    @PostMapping("/addemps")
	    public Employee addEmployee(@RequestBody Employee employee) {
	    	return employeeService.CreateEmployee(employee);
	    }
	    
}
