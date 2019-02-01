package com.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.servlet.util.ServletUtil;

/**
 * Servlet implementation class HelloServlet
 */
// map the html form action url with urlPatterns

//@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletUtil util=null;  
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	// After matching url pattern this constructor and init() method will call.
	// After that service method will call and container will create req and res
	// objects pass this object to appropriate doxxx() method ant it will
	// execuate
	// thent execuate bussines logic and back response to client and desro
	// method will call. It destroys the req and res object.
	public HelloServlet() {
		super();
	
	}
	
	
	public void init(ServletConfig servletConfig) throws ServletException {
	      // Do required initialization
	      System.out.println("Initializing Servlet");
	      System.out.println("--------"+servletConfig.getInitParameter("driverName"));
	   }
	
	
	

	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in hello servlet---------------");
		
		
		 Cookie c[]=request.getCookies(); 
		 
		 	for (Cookie cookie : c) {
				System.out.println("Name--"+cookie.getName());
				System.out.println("Value:--"+cookie.getValue());
				System.out.println("----path-----"+cookie.getPath());
			}
		
/*		ServletContext context = getServletContext();
		System.out.println("Servlet context----------"+context.getInitParameter("driverName"));
		System.out.println("Context path of web Application----------"+context.getContextPath());
		System.out.println("servlet Information---"+context.getServerInfo());
		System.out.println("servlet context name---------"+context.getServletContextName());
		System.out.println("servlet major version--------"+context.getMajorVersion());
		System.out.println("servlet minor version--------"+context.getServerInfo());*/
	
//		String name=request.getParameter("username"); //get parameter from request
		String name="Amol";
		response.setContentType("text/plain");  //set content type of response being send to client.
		response.getWriter().write(name);
//		PrintWriter out=response.getWriter(); //sent character string to client 
		/*request.setAttribute("message", name);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ViewPages/login.jsp");   //Receives requests from the client and sends them to any resource (such as a servlet,HTML file, or JSP file) on the server.
		dispatcher.forward(request,response);
		System.out.println("After forward request");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in ajax call post");
		util=new ServletUtil();
		JSONObject jsonObject=util.constructJson(request);
		
		System.out.println(jsonObject);
		response.setContentType("text/plain");
		
		response.getWriter().write((String) jsonObject.get("name"));
		response.getWriter().write((String) jsonObject.get("email"));

			
	}

}
