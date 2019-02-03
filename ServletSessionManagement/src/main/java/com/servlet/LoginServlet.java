package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int a;
	public static final String userName="amol";
	public static final String password="amol@123";
	RequestDispatcher requestDispacher=null;
	
	public void init() {
		System.out.println("serialVersionUID:-   "+serialVersionUID+"aa"+a);
		
		
		ServletContext context=getServletContext();
		System.out.println("Contect:---"+context);
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("userName").equals("amol") && request.getParameter("password").equals("amol@123")) {
			HttpSession httpSeesion=request.getSession();
			
			System.out.println("sessionID:--"+ httpSeesion.getId());
			httpSeesion.setAttribute("username", request.getParameter("userName"));
			try {
				requestDispacher=getServletContext().getRequestDispatcher("/welcome.jsp");
				requestDispacher.forward(request, response);
//			response.sendRedirect("/welcome.jsp");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			 requestDispacher = getServletContext().getRequestDispatcher("/index.jsp");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Either user name or password is wrong.</font>");
			requestDispacher.include(request, response);
		}
		
	}

}
