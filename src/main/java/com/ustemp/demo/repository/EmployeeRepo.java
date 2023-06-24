package com.ustemp.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ustemp.demo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String>{
	
}
