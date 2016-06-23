package selenium;

public class staticarrayeg3 {

	public static void main(String[] args) 
	{
		Object[] x={"Selenium",'M',20000,4434.3434,true}; 
		
		System.out.println(x.length);
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
			
		}
		
		x[0]="Sharath";
//		System.out.println(x[0]);
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
			
		}

	}

}
