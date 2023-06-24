package com.ustemp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustemp.demo.model.Employee;
import com.ustemp.demo.repository.EmployeeRepo;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public Employee CreateEmployee(Employee employee) {
		
		return repo.save(employee);
	}

}