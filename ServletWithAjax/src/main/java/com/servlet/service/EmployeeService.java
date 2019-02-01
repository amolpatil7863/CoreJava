package com.servlet.service;

import java.util.List;

import org.json.JSONObject;

import com.servlet.model.Employee;

public interface EmployeeService {
public boolean addEmp(JSONObject jsonObject);
public List<Employee> getEmployeeList();
}
