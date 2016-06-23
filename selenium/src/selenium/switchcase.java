package selenium;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String course=sc.next();
		
		switch (course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Qtp":
			System.out.println("You are selected Qtp");
			break;
		case "Loadrunner":
			System.out.println("You are selected Loadrunner");
			break;

		default:
			System.out.println("Select a proper option");
			break;
		}

	}

}
