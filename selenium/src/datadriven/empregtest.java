package datadriven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import functions.orgmaster;

public class empregtest
{
	@Test
	public void empreg() throws IOException
	{
		orgmaster om=new orgmaster();
		String x="";
		String rFile="F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\testdata\\Empregdata.txt";
		String wFile="F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\Results\\Empregres.txt";
				
		FileReader fr=new FileReader(rFile);
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter(wFile);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Firstname&Lastname&Result"+"\n");
		
		br.readLine();
		
		om.org_Launch("Http://opensource.demo.orangehrm.com");
		om.org_Login("Admin", "admin");
		
		while ((x=br.readLine())!=null) 
		{
			String[] split=x.split("&");
			String f=split[0];
			String l=split[1];
			System.out.println(f+"--"+l);
			String res=om.org_Empreg(f, l);
			bw.write(x+"&"+res+"\n");
		}
		om.org_Logout();
		om.org_Close();
		br.close();
		bw.close();
	}

}
