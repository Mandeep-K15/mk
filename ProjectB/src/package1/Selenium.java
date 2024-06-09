package package1;

public class Selenium 
{
	public Selenium() 
	{
	System.out.println("Default Constructor");
	}

	public Selenium(int a) 
	{
	System.out.println("One parameterized Constructor");
	}

	public Selenium(int a, int b) 
	{
	System.out.println("Two parameterized Constructor");
	}
	public static void main(String[] args) 
	{
	Selenium ob=new Selenium(122,444);
	}
}
