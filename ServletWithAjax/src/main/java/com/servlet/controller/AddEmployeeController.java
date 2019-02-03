package com.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.servlet.model.Employee;
import com.servlet.service.EmployeeService;
import com.servlet.service.EmployeeServiceImpl;
import com.servlet.util.ServletUtil;

/**
 * Servlet implementation class AddEmployeeController
 */
//@WebServlet(urlPatterns="/ViewPages/addEmp")
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletUtil servletUtl=null;
    private EmployeeService employeeService=null;
    private Gson gson = new Gson();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeController() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json, charset=UTF-8");
System.out.println(request.getCharacterEncoding()+""+"ppppp------"+request.getContextPath()+"--"+request.getContentLength()+"  "+request.getContentType()+"  "+request.getProtocol()+"  "+request.getLocalAddr()+" "+request.getMethod());
		servletUtl=new ServletUtil();
		JSONObject json_emp=servletUtl.constructJson(request);
		System.out.println("json----------"+json_emp);
		if(json_emp!=null){
			employeeService=new EmployeeServiceImpl();
			if(employeeService.addEmp(json_emp)!=false){
				/*jsonObj.put("msg", "Data saved successfully");*/
				/*response.getWriter().write("Data saved successfully");*/
				/*json=jsonData.toJson("Data saved successfully");*/
				Employee employee=new Employee(1, "ajit", "ICH", 20000);
				/*response.getWriter().println(json);*/
				/*new Gson().toJson(json,response.getWriter());*/
				 String employeeJsonString = this.gson.toJson("Data saved successfully");
				 response.getWriter().print(employeeJsonString);
			}else{
				/*System.out.println("json from server-91----------"+json);
				json=jsonData.toJson("Proble with saving Employee information");
				new Gson().toJson(json,response.getWriter());*/
			/*	response.getWriter().println(json);*/
				/*response.getWriter().write("Proble with saving Employee information");*/
				/*jsonObj.put("msg", "Proble with saving Employee information");*/
			}
		}else{
			/*response.getWriter().write("Proble with saving Employee information");*/
		/*	System.out.println("json from server-175----------"+json);
			json=jsonData.toJson("Proble with saving Employee information");*/
			/*response.getWriter().println(json);*/
			/*new Gson().toJson(json,response.getWriter());*/
			
		}
	}

}
