package com.servlet.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.util.ServletUtil;


/**
 * Servlet implementation class LoginController
 */
//@WebServlet(urlPatterns = "/login_success")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletUtil util = null;
	private boolean isMultipart;
	private String filePath;
	private int maxFileSize = 50 * 1024;
	private int maxMemSize = 4 * 1024;
	private File file;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 String name = request.getParameter("userName");
         String password = request.getParameter("userPassword");
        
         //Creating two cookies
         Cookie c1=new Cookie("userName",name);
         Cookie c2=new Cookie("userPassword",password);

         //Adding the cookies to response header
         response.addCookie(c1);
         response.addCookie(c2);
        
		
		
		/*HttpSession session = request.getSession();
		Cookie cookies=new Cookie("userName", "amol");
		filePath=request.getRealPath("/");
		System.out.println("filepath-------"+filePath);
		isMultipart = ServletFileUpload.isMultipartContent(request);
//	    response.setContentType("text/html");
	    DiskFileItemFactory factory = new DiskFileItemFactory(); 
	    // maximum size that will be stored in memory
	    factory.setSizeThreshold(maxMemSize);
	    System.out.println("request type="+isMultipart);
	    // Create a new file upload handler
	    ServletFileUpload upload = new ServletFileUpload(factory);
	    // maximum file size to be uploaded.
	    upload.setSizeMax( maxFileSize );
	    try{
	    	List fileItems = upload.parseRequest(request);
	    	System.out.println("fileitem---"+fileItems);
	    	Iterator i = fileItems.iterator();
	    	 while ( i.hasNext () ) {
	             FileItem fi = (FileItem)i.next();
	             if ( !fi.isFormField () ) {
	                // Get the uploaded file parameters
	                String fieldName = fi.getFieldName();
	                String fileName = fi.getName();
	                String contentType = fi.getContentType();
	                boolean isInMemory = fi.isInMemory();
	                long sizeInBytes = fi.getSize();
	             
	                // Write the file
	                if( fileName.lastIndexOf("\\") >= 0 ) {
	                   file = new File( filePath + fileName.substring( fileName.lastIndexOf("\\"))) ;
	                } else {
	                   file = new File( filePath + fileName.substring(fileName.lastIndexOf("\\")+1)) ;
	                }
	                fi.write( file ) ;
	                System.out.println("Uploaded Filename: " + fileName + "<br>");
	             }
	          }
	    	
	    	
	    }catch(Exception e){
	    	System.out.println("Exception---"+e);
	    }
*/		/*
		 * util = new ServletUtil(); JSONObject jsonObject =
		 * util.constructJson(request); System.out.println(jsonObject);
		 * if(jsonObject.getString("email")!=null &&
		 * jsonObject.getString("password")!=null){ if
		 * (jsonObject.getString("email").equals("amol.patil7863@gmail.com") &&
		 * jsonObject.getString("password").equals("amol@123")) {
		 * response.getWriter().write("success"); System.out.println("success");
		 * } else { response.getWriter().write("Access Denied"); } }else{
		 * response.getWriter().write("Access Denied"); }
		 */
	}
	
	public void init() throws ServletException {
	      // Do required initialization
	      System.out.println("Initializing Login Servlet");
	   }
	

}
