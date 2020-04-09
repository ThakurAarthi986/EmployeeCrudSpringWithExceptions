package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.EmployeeDao;
import com.capgemini.bean.Employee;

@Service
public class EmployeeService implements EmployeeServiceI {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public String createEmployee(Employee employee) {
		employeeDao.save(employee);
		return "Employee has been created";
	}
	
	@Override
	public Employee findEmployeeById(int id) {
		return employeeDao.findOne(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		List<Employee> employees=employeeDao.findAll();
		return employees;
	}

	@Override
	public String deleteEmployee(int eid) {
		boolean result=employeeDao.exists(eid);
		if(result) {
			employeeDao.delete(eid);
			return "deleted successfully!";
		}
		else
		return "Employee doesn't exists";
	}
	@Override
	public String updateEmployee(Employee employee) {
		boolean result=employeeDao.exists(employee.getEid());
		if(result) {
			employeeDao.save(employee);
			return "Employee Updated successfully!";
		}
		else {
			employeeDao.save(employee);
		return "New employee is inserted";
		}
	}

	@Override
	public List<Employee> GreaterThan100() {
			return employeeDao.GreaterThan100();
		}

}