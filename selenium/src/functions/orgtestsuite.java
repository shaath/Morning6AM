package functions;

import java.io.IOException;

public class orgtestsuite {

	public static void main(String[] args) throws IOException 
	{
		orgmaster om=new orgmaster();
		//logintest
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");

		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		
		//empreg test
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		res=om.org_Empreg("Suresh", "B");
		System.out.println(res);
			
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

		//user reg
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println(res);

		
		res=om.org_Userreg("Suresh B", "Suresh123456", "Suresh123456", "Suresh123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//user login
		
		 res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("Suresh123456", "Suresh123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		

	}

}
