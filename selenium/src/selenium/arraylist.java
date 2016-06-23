package selenium;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args)
	{
		ArrayList<String> s=new ArrayList<String>();
		
		//write the data into the arraylist 
		
		s.add("Selenium");
		s.add("Dnyaneshwar");
		s.add("Manasa");
		s.add("Sharath");
		s.add(4,"Qedge");
		
		//length of the arraylist
		
		System.out.println(s.size());
		
		//read the data from arraylist
		
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
		}
		
		
		
	}

}
