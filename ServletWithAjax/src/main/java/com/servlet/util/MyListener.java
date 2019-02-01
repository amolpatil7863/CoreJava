package com.servlet.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
//		System.out.println("Listner initialize-------------"+sce.getServletContext().toString());
		System.out.println("--------------------------Application starting up----------------------------------- ");
	}
	
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
//		System.out.println("Listner destroyed---------------"+sce.getServletContext().toString());
		System.out.println("--------------------------Application shut down----------------------------------- ");
	}

}
