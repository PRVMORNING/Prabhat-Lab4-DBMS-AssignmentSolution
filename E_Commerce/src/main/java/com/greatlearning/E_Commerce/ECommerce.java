package com.greatlearning.E_Commerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ECommerce {
	
	public static void main( String[] args )
    {
    	String jdbcUrl="jdbc:mysql://localhost:3306/E_COMMERCE?allowPublicKeyRetrieval=true&useSSL=false";
    	    	  String userName="root";
    	    	  String password="prv123PRV#";  	  
      try
      {
    	  System.out.println("Connecting to database");
    	  Connection myConn=DriverManager.getConnection(jdbcUrl,userName,password) ;
    	 
    	  System.out.println("Connection successfull");
    	  
    	  Statement myStmt=myConn.createStatement();
    	  
    	 ResultSet myRs= myStmt.executeQuery("Select * from Supplier");
    	  
      while (myRs.next())
       {
    	  System.out.println(myRs.getString("SUPP_NAME") + " ,"+(myRs.getString("SUPP_CITY")));
       }
      
      }
      catch(SQLException exc)
      {
    	  exc.printStackTrace();
      }
    }
}

