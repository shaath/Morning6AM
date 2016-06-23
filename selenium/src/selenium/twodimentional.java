package selenium;

public class twodimentional {

	public static void main(String[] args) 
	{
		int[][] sal=new int[2][3];
		
		//finding the of the array
		
		System.out.println(sal.length);
		
		System.out.println(sal[0].length);
		
		//writing the data into the array
		
		sal[0][0]=30000;
		sal[0][1]=50000;
		sal[0][2]=20000;
		sal[1][0]=20000;
		sal[1][1]=20000;
		sal[1][2]=20000;
		
		//read the data from the array
		//rows
		for (int i = 0; i < sal.length; i++)
		{
			//columns
			for (int j = 0; j < sal[i].length; j++)
			{
				System.out.println(sal[i][j]);
			}
			
		}
				
				
		
		
		

	}

}
