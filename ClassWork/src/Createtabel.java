import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Createtabel {
	
	@Test
	public void test() throws Exception {
		
		//create class for intract db
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/sample", "root", "");
				Statement stmt=  conn.createStatement();
	            stmt.executeUpdate("create table orderdata(Cust_id int,Cust_name varchar(255),Cust_address varchar(255))");
				stmt.executeUpdate("insert into orderdata values(101,'vali','vij')");
				stmt.executeUpdate("insert into orderdata values(102,'harish','hyd')");
				
				stmt.executeUpdate("insert into orderdata values(103,'naveen','hyd')");
			
	}

}
