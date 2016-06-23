package selenium;

public class dynamicarray {

	public static void main(String[] args) 
	{
		int[] sal=new int[10];
		
		//length of the array
		
		System.out.println(sal.length);
		
		//writing the data into the array
		
		sal[0]=20000;
		sal[1]=30000;
		sal[5]=40000;
		sal[6]=50000;
		
		
		//read the values from the array
		
		for (int i = 0; i < sal.length; i++)
		{
			System.out.println(sal[i]);
			
		}
		

	}

}
