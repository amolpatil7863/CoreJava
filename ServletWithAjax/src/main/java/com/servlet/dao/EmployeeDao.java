package com.servlet.dao;

import java.util.List;

import com.servlet.model.Employee;

public interface EmployeeDao {
	public void addEmp(Employee employee);
	public List<Employee> getEmployeeList();
}
