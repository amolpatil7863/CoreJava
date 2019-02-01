package com.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.servlet.model.Employee;
import com.servlet.service.EmployeeService;
import com.servlet.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet(urlPatterns="/ViewPages/getAllEmp")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService employeeService=null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		employeeService=new EmployeeServiceImpl();
		List<Employee> emp_list=employeeService.getEmployeeList();
		new Gson().toJson(emp_list, response.getWriter());
	}

}
