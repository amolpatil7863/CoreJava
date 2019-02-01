package com.servlet.service;

import java.util.List;

import org.json.JSONObject;

import com.servlet.dao.EmployeeDao;
import com.servlet.dao.EmployeeDaoImpl;
import com.servlet.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao employeeDao = new EmployeeDaoImpl();

	public boolean addEmp(JSONObject jsonObject) {
		try {

			Employee employee = new Employee();
			employee.setName(jsonObject.getString("empName"));
			employee.setAddress(jsonObject.getString("address"));
			employee.setSalary(jsonObject.getFloat("salary"));
			employeeDao.addEmp(employee);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public List<Employee> getEmployeeList() {
		return employeeDao.getEmployeeList();
	}

}
