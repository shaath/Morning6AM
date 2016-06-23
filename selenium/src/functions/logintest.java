package functions;

import java.io.IOException;

public class logintest {

	public static void main(String[] args) throws IOException
	{
		orgmaster om=new orgmaster();
		
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		res=om.org_Login("sharathchandra", "sharathchandra");
		System.out.println(res);
//		
//		res=om.org_Empreg("Sharath", "Chandra");
//		System.out.println(res);
		
//		res=om.org_Userreg("Sharath Chandra", "sharathchandra", "sharathchandra", "sharathchandra");
//		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
