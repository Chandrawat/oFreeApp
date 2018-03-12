package login;
import java.text.*;
import java.util.*; 
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDAO {

	 static Connection currentCon = null; 
	 static ResultSet rs = null; 
	 public static UserBean login(UserBean bean) 
	 	{ 
		 //preparing some objects for connection
		 String databaseURL = "jdbc:mysql://localhost:3306/ofree/loginpage/users";
		 System.out.println("+++++++++"+databaseURL);
		 Statement stmt = null; 
		 String username = bean.getUsername(); 
		 String password = bean.getPswd(); 
		 String searchQuery = "select * from loginpage.users where username='" + username + "' AND pswd='" + password + "'";
		 		 
		 Connection conn = null;
		 
		 System.out.println("Your user name is " + username); 
		 
		 System.out.println("Your password is " + password);
		 
		 System.out.println("Query: "+searchQuery); 
		 	try { //connect to DB 
		 		Class.forName("com.mysql.jdbc.Driver");
		 		//conn = DriverManager.getConnection(databaseURL, username, password);
		 		currentCon = ConnectionManager.getConnection(); 
		 		stmt=currentCon.createStatement(); 
		 		rs = stmt.executeQuery(searchQuery); 
		 		boolean more = rs.next(); 
		 		// if user does not exist set the isValid variable to false 
		 		 if (!more) { 
		 			 System.out.println("Sorry, you are not a registered user! Please sign up first"); 
		 			 bean.setValid(false); } //if user exists set the isValid variable to true 
		 		 else if (more) 
		 		 	{ String firstName = rs.getString("FirstName"); 
		 		 	  String lastName = rs.getString("LastName"); 
		 		 	  System.out.println("Welcome " + firstName); 
		 		 	  bean.setFirstName(firstName); 
		 		 	  bean.setLastName(lastName); 
		 		 	  bean.setValid(true); } } 
		 	catch (Exception ex) 
		 		{ 
		 		
		 		System.out.println("Log In failed: An Exception has occurred! " + ex); 
		 		
		 		} //some exception handling
		 	
		 	finally { 
		 		if (rs != null) { 
		 			try { rs.close();		 	
		 			} 
		 	catch (Exception e) {} rs = null; } if (stmt != null) { try { stmt.close(); }
		 	
		 	catch (Exception e) {} stmt = null; } if (currentCon != null) { 
		 		
		 		try { currentCon.close(); } catch (Exception e) { } currentCon = null; } 
		 	} 
		 	
		 	return bean; 
		 	
	 	} 

}
