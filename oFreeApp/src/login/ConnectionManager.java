package login;

import java.sql.*; import java.util.*; 

public class ConnectionManager {

	 static Connection con; 
	 static String url;
	
	 public static Connection getConnection()
	 { 
		 try { 
			 System.out.println("starts");
			 String url = "jdbc:mysql://localhost:3306/loginpage"; 
		 System.out.println("connection starts"+ url);
			 // assuming "DataSource" is your DataSource name 
		 Class.forName("com.mysql.jdbc.Driver"); 
		 
		 
		 
		   try { 
			   System.out.println("connection manager starts");
			   con = DriverManager.getConnection(url,"root","");
			   
			   if(con==null){
				   System.out.println("Connection failed!!!");
			   }
			   
		   System.out.println("connection established");
		      // assuming your SQL Server's username is "username" 
		   // and password is "password"
		   }
		   catch (SQLException ex) 
		      { 
			   System.out.println("reached in connection manager catch getconnection class");
			   ex.printStackTrace();
		      
		       } 
		   } 
		    catch(ClassNotFoundException e) { 
		  System.out.println("outside connection manager class");
		    	System.out.println(e); 
		    	
		    } 
		 return con; 
	 }
		 
}
	 

