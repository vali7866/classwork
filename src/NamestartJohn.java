import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class NamestartJohn {

	@Test
	public void main() throws Exception {
		
		//create class for intract db
		
				Class.forName("com.mysql.jdbc.Driver");
				//establish con with db	
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "");
				//create statement
				Statement stmt=  conn.createStatement();
				//excute query
				ResultSet rs= stmt.executeQuery("Select * from cust where cust_name like 'john%' ");
				while(rs.next()) {
					System.out.println("Cust_id :"+rs.getInt(1) +"||"+"Cust_name :"+rs.getString(2)+"\t || "+"Cust_addess :"+rs.getString(3));
					
				}
				
				// close the db
				 
				 rs.close();
		
		
		
		
	}
	
	
}
