/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobportal.jobpost;

import java.sql.*;

/**
 *
 * @author AMOL
 */
public class ConnectionProvider {
	private static Connection con = null;

	public static Connection getCon() throws Exception {
		Class.forName(Provider.DRIVER);
		con = DriverManager.getConnection(Provider.CONNECTION_URL, Provider.USERNAME, Provider.PASSWORD);

		return con;
	}

}
