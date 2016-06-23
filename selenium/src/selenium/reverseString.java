package selenium;

public class reverseString {

	public static void main(String[] args) 
	{
		//Qedge--------> egdeQ
		String out="";
		String original="Qedge";
		int length=original.length();
		System.out.println(length);
		
		for (int i = length-1; i >= 0; i--)
		{
			char reverse=original.charAt(i);
			
			out=out+reverse;
			
		}
		
		System.out.println(out);

	}

}
