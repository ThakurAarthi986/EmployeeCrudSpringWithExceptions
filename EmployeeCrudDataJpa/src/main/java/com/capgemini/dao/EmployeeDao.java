package com.capgemini.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capgemini.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	
	// user defined query
	@Query("select ename,esal from Employee where esal>100")
	List<Employee>GreaterThan100();

}