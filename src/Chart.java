import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Chart {
	FileInputStream fis;
	XSSFWorkbook wb;
 	  XSSFSheet sheet1;
 	  
 	  @Test
 	  
	public void tes1() throws Exception {

   	 File f= new File("C:\\Users\\VALI\\Desktop\\TestData1.xlsx");
   	  // getting excel info
   	  FileInputStream fis= new FileInputStream(f);
   	  XSSFWorkbook wb= new XSSFWorkbook(fis);
   	  XSSFSheet sheet1= wb.getSheetAt(1);
   	  
   	  String message="vali";
   	  sheet1.getRow(1).getCell(2).setCellValue(message);
   	  String message1="meera";
   	  sheet1.getRow(2).getCell(2).setCellValue(message1);
   	  String message3="nagul";
   	  sheet1.getRow(3).getCell(2).setCellValue(message3);
   	  
   	String message11="vali";
 	  sheet1.getRow(4).getCell(2).setCellValue(message11);
 	  String message12="meera";
 	  sheet1.getRow(5).getCell(2).setCellValue(message12);
 	  String message13="nagul";
 	  sheet1.getRow(6).getCell(2).setCellValue(message13);
 	  
 	 String message111="vali";
  	  sheet1.getRow(7).getCell(2).setCellValue(message111);
  	  String message1111="meera";
  	  sheet1.getRow(8).getCell(2).setCellValue(message1111);
  	  String message1113="nagul";
  	  sheet1.getRow(9).getCell(2).setCellValue(message1113);
  	  


		  System.out.println("Write data sucuss");
		  FileOutputStream fileOutput = new FileOutputStream(f);
		  wb.write(fileOutput);
		  fileOutput.close();

	}

}
