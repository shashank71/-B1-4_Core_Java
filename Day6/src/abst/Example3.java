package abst;

public class Example3 {
	void display()
	{
		System.out.println("Hello Students");
	}
}
 class Example extends Example3
{
	 
	
	void display()
	{
		
		System.out.println("Welcome to C2TC");
	}

	public static void main(String[] args) 
	{
		Example2 e=new Example2();
		e.display();

	}

}