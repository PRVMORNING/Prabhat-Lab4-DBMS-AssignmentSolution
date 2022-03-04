package com.greatlearning.E_Commerce;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    public static void main(String[]args) 
    {
    	String jdbcUrl="jdbc:mysql://localhost:3306/E_COMMERCE?useSSL=false";
  	  String userName="root";
  	  String password="admin";
  	  
  	  try {
  		 System.out.println("Connecting to database");
  		  
  		Connection myConn=DriverManager.getConnection(jdbcUrl,userName,password);
  	  System.out.println("Connection successfull");
  	  }
  	  
  	catch(SQLException exc)
      {
    	  exc.printStackTrace();
      }
  	
    	
    }
}
