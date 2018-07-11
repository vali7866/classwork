import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

class dBTOxL {

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
				ResultSet rs= stmt.executeQuery("Select * from cust");

				File f= new File("C:\\Users\\VALI\\Desktop\\TestData1.xlsx");
		  	  // getting excel info
		  	    FileInputStream fis= new FileInputStream(f);
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				
				XSSFSheet sh=wb.createSheet("3");
				
				XSSFRow row=sh.createRow(0);
				
				XSSFCell cell;
				
				cell=row.createCell(0);
				
				cell.setCellValue("cust_id");
				
				cell=row.createCell(1);
				
				cell.setCellValue("cust_name");
				
				cell=row.createCell(2);
				
				cell.setCellValue("cust_address");
				
				int i=1;
				while (rs.next())
				{
					
					row = sh.createRow(i);
			          cell = row.createCell(0);
			          cell.setCellValue(rs.getInt(1));
			          cell = row.createCell(1);
			          cell.setCellValue(rs.getString(2));
			          cell = row.createCell(2);
			          cell.setCellValue(rs.getString(3));
			          i++;
				}
				
			
				 FileOutputStream ot = new FileOutputStream(f);
			      wb.write(ot);
			      ot.close();
			      
			      System.out.println("complete");

				
	}
	
}
