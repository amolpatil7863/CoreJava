/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobportal.register;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author AMOL
 */
public class ConnectionProvider 
{
    private static Connection con=null;  
    static{  
        try{  
                Class.forName(Provider.DRIVER);  
                con=DriverManager.getConnection(Provider.CONNECTION_URL,Provider.USERNAME,Provider.PASSWORD);  
            }catch(Exception e){}  
           }  
  
    public static Connection getCon()
    {  
            return con;  
    }  
}
