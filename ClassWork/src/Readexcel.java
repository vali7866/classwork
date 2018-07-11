import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readexcel {
	@Test
	public void main() throws Exception {
		
		File f= new File("C:\\Users\\VALI\\Desktop\\TestData1.xlsx");
  	  // getting excel info
  	  FileInputStream fis= new FileInputStream(f);
  	  XSSFWorkbook wb= new XSSFWorkbook(fis);
  	  XSSFSheet sheet1= wb.getSheetAt(0); 
  	  int rowcount=sheet1.getLastRowNum();
  	 
  	  
  	  for(int i=1;i<rowcount;i++)
  	  {
  		String st1= sheet1.getRow(i).getCell(0).getStringCellValue();
		String st= sheet1.getRow(i).getCell(1).getStringCellValue();
  		String st2= sheet1.getRow(i).getCell(2).getStringCellValue();
		System.out.println("custid :"+ st1 + " "+"custname :"+ st + " "+"testingtype :"+ st2 + " " );
    	
  	  }

  	 

		  System.out.println("read data sucuss");
  	 
  	 
		
	}

}
