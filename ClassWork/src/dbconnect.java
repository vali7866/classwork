import java.sql.*;

import org.testng.annotations.Test;

public class dbconnect {

	
	@Test
	public void main() throws Exception {
		
		//create class for intract db
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//establish con with db
		
	//	DriverManager.getConnection("url", "username", "password");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "");
		
		//create statement
		
		Statement stmt=  conn.createStatement();
		
		//excute query
		
		System.out.println("db connected");
		/*ResultSet rs= stmt.executeQuery("Select * from cust");
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
		
		// close the db
		 
		 rs.close();*/
	}
	
	
}
