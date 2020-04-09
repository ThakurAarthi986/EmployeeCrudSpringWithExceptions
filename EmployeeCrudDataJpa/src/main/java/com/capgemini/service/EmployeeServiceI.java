package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Employee;


public interface EmployeeServiceI {

	   Employee findEmployeeById(int id);

	    String createEmployee(Employee employee);
	    List<Employee> findAllEmployees();
	    String deleteEmployee(int eid);
        List<Employee>GreaterThan100();
	    String updateEmployee(Employee employee);

	
	
}