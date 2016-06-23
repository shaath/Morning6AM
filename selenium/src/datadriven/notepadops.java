package datadriven;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class notepadops
{
	@Test
	public void notepad() throws IOException
	{
		String npath="F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\testdata\\testdata.txt";
		FileReader fr=new FileReader(npath);
		BufferedReader txtreader=new BufferedReader(fr);
		
//		System.out.println(txtreader.readLine());
//		System.out.println(txtreader.readLine());
		
		while (!(txtreader.readLine()).equals(null))
		{
			try {
				System.out.println(txtreader.readLine());
			}
			catch (Exception e)
			{
				txtreader.close();
			}
			
			
		}
		
		fr.close();
	}

}
