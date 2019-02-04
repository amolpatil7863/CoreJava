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
	HttpSession session=null;
	public void init() {
		System.out.println("serialVersionUID:-   "+serialVersionUID+"aa"+a);
		
		
		ServletContext context=getServletContext();
		System.out.println("Context:---"+context);
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession currentSession=request.getSession();	
		String name=(String) currentSession.getAttribute("username");
		System.out.println("CurrentSession:- "+name);		
		if(name!=null){
			System.out.println("Session was maintained");
			requestDispacher=getServletContext().getRequestDispatcher("/welcome.jsp");
			requestDispacher.forward(request, response);
		}else{
			System.out.println("Please Login");
			 requestDispacher = getServletContext().getRequestDispatcher("/index.jsp");
//			 PrintWriter out= response.getWriter();
//			 out.println("<font color=red>Either user name or password is wrong.</font>");
		     requestDispacher.include(request, response);
		     
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		/*ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		System.out.println("classloader- "+ classloader.getClass());
		*/
		
		if(request.getParameter("userName").equals("amol") && request.getParameter("password").equals("amol@123")) {
			HttpSession httpSeesion=request.getSession();
			
			System.out.println("sessionID:--"+ httpSeesion.getId());
			httpSeesion.setAttribute("username", request.getParameter("userName"));
			System.out.println("--------------------Session Created---------------------");
//			httpSeesion.setAttribute("loginStatus", true);
			try {
				requestDispacher=getServletContext().getRequestDispatcher("/welcome.jsp");
				requestDispacher.forward(request, response);
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
