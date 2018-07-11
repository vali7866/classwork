import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class writeexcel {

	@Test
	public void main() throws Exception {
		

    	
    	 File f= new File("C:\\Users\\VALI\\Desktop\\TestData1.xlsx");
    	  // getting excel info
    	  FileInputStream fis= new FileInputStream(f);
    	  XSSFWorkbook wb= new XSSFWorkbook(fis);
    	  XSSFSheet sheet1= wb.getSheetAt(0); 
    	  String message="ID";
    	  sheet1.getRow(0).getCell(0).setCellValue(message);
    	  String message1="NAME";
    	  sheet1.getRow(0).getCell(1).setCellValue(message1);
    	  String message3="DEP";
    	  sheet1.getRow(0).getCell(2).setCellValue(message3);
    	  
    	  String message5="101";
    	  sheet1.getRow(1).getCell(0).setCellValue(message5);
    	  String message6="VALI";
    	  sheet1.getRow(1).getCell(1).setCellValue(message6);
    	  String message7="TESTING";
    	  sheet1.getRow(1).getCell(2).setCellValue(message7);
    	  
    	  String message8="102";
    	  sheet1.getRow(2).getCell(0).setCellValue(message8);
    	  String message9="NAVEEN";
    	  sheet1.getRow(2).getCell(1).setCellValue(message9);
    	  String message10="MANUAL";
    	  sheet1.getRow(2).getCell(2).setCellValue(message10);
    	  
    	  String message11="103";
    	  sheet1.getRow(3).getCell(0).setCellValue(message11);
    	  String message12="HAISH";
    	  sheet1.getRow(3).getCell(1).setCellValue(message12);
    	  String message13="MANUAL";
    	  sheet1.getRow(3).getCell(2).setCellValue(message13);
    	  
    	  String message14="104";
    	  sheet1.getRow(4).getCell(0).setCellValue(message14);
    	  String message15="VINOD";
    	  sheet1.getRow(4).getCell(1).setCellValue(message15);
    	  String message16="MANUAL";
    	  sheet1.getRow(4).getCell(2).setCellValue(message16);

		  System.out.println("Write data sucuss");
		  FileOutputStream fileOutput = new FileOutputStream(f);
		  wb.write(fileOutput);
		  fileOutput.close();
    	 
    	 
	}
	
}
