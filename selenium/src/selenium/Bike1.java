package selenium;

public class Bike1 
{
	int id;
	String name;
	int age;
	Bike1(int i,String n)
	{
		id=i;
		name=n;
		System.out.println(id+"--"+name);
	}
	
	Bike1(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
		System.out.println(id+"--"+n+"--"+a);
	}

	public static void main(String[] args) 
	{
		Bike1 b=new Bike1(200,"Selenium");
		Bike1 c=new Bike1(444,"Qedge",25);

	}

}
