import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Readtable {
	@Test
	public void main() throws Exception {
	
	//create class for intract db
			Class.forName("com.mysql.jdbc.Driver");

			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "");
			//create statement
			
			Statement stmt=  conn.createStatement();
			//excute quer	
			ResultSet rs= stmt.executeQuery("Select * from cust where cust_id <107;");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			// close the db
			 
			 rs.close();
	
	
	
	
}
}
