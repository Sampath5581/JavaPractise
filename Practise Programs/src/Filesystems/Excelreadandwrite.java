package Filesystems;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelreadandwrite {
	static XSSFWorkbook wb;
	static XSSFSheet xs;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs=new FileInputStream("D:\\Selenium\\TestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet xs=wb.getSheet("Sheet1");
		int rc=xs.getLastRowNum();
		System.out.println(rc);
		for(int i=0;i<=rc;i++){
			if(xs.getRow(i).getCell(6)!=null){
				int temp=i;
				if(xs.getRow(i).getCell(6).getStringCellValue().equalsIgnoreCase("N")){
					XSSFRow row=xs.getRow(temp);
					XSSFCell cell=row.createCell(7);
					cell.setCellValue("Pass");
					FileOutputStream fo=new FileOutputStream("D:\\Selenium\\TestData.xlsx");
					wb.write(fo);
					fo.close();
				}
				
			}
		}

	}
	
	

}
