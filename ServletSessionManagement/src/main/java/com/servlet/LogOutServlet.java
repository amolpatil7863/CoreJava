package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LogOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher requestDispacher=null;
	
	public void init() {
		
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogOutServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Destroying Session");
		HttpSession session = request.getSession(false);
		
		if(session!=null){
			session.invalidate();
		}
		requestDispacher=getServletContext().getRequestDispatcher("/index.jsp");
		requestDispacher.forward(request, response);
//		response.sendRedirect("/index.jsp");
		
	}

}
