package kwyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import functions.orgmaster;

public class driverscript 
{
	@Test
	public void driver() throws IOException
	{
		orgmaster om=new orgmaster();
		String res=null;
		String xlpath="F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\testdata\\Keyword.xlsx";
		String xlpath1="F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\Results\\keyoutres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws1=wb.getSheet("Testcase");
		XSSFSheet ws2=wb.getSheet("Teststeps");
		
		int tcRc=ws1.getLastRowNum();
		int tsRc=ws2.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++) 
		{
			String exe=ws1.getRow(i).getCell(2).getStringCellValue();
			
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws1.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcid=ws2.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcid))
					{
						String key=ws2.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrm.com");
							break;
							
						case "login":
							res=om.org_Login("Admin", "admin");
							break;
							
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
							
						case "Empreg":	
							res=om.org_Empreg("Siri", "M");
							break;
							
						case "Usereg":
							res=om.org_Userreg("Siri M", "Siri123456", "Siri123456", "Siri123456");
							break;
							
						case "Ulogin":
							res=om.org_Login("Siri123456", "Siri123456");
							break;

						default:
							System.out.println("Enter a Valid Keyword");
							break;
						}
						//result updation in steps sheet
						ws2.getRow(j).createCell(4).setCellValue(res);
						//result updation in test case sheet
						
						if (!ws2.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail")) 
						{
							ws1.getRow(i).createCell(3).setCellValue(res);
						}
						else
						{
							ws1.getRow(i).createCell(3).setCellValue("Fail");
						}
						
						
					}
					
				}
				
			}
			else
			{
				ws1.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			FileOutputStream fo=new FileOutputStream(xlpath1);
			wb.write(fo);
			wb.close();
		}
		
	}
}
