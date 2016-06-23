package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import functions.orgmaster;

public class datadrivenxl 
{
	@Test
	public void xlops() throws IOException
	{
		orgmaster om=new orgmaster();
		String xlpath="F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\testdata\\Emptestdata.xlsx";
		String Rpath="F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\Results\\empres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
//		XSSFRow R=ws.getRow(4);
//		XSSFCell C=R.getCell(0);
//		
//		System.out.println(C.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		om.org_Launch("http://opensource.demo.orangehrm.com");
		om.org_Login("Admin", "admin");
		for (int i = 1; i <= Rc; i++)
		{
			XSSFRow R=ws.getRow(i);
			XSSFCell C=R.getCell(0);
			XSSFCell C1=R.getCell(1);
			String f=C.getStringCellValue();
			String l=C1.getStringCellValue();
			
			System.out.println(f+"---"+l);
			String res=om.org_Empreg(f, l);
			//writing the data into cell
			R.createCell(2).setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(Rpath);
		wb.write(fo);
		wb.close();
		om.org_Logout();
		om.org_Close();
		
	}
}
