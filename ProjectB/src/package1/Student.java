package package1;

public class Student 
{
	int deepak;
	public void display()
	{
		System.out.println("Welcome to all");		
	}
	public static void main(String[] args) 
	{
		Student ob=new Student();
		ob.display();
		ob.display();
		ob.deepak=334;
		System.out.println("Value of deepak"+ob.deepak);
	}
	
}
