package com.example.demo.mypkg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
	}
	
	public List<Employee> getEmployees(){
		return employeeRepo.findAll();
	}
}
