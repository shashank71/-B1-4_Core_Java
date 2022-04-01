package oops;

public class Non_parametarize {

	String str;
	int a;
	Non_parametarize()
	{
		str="Shashank";
		a=101;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	

	public static void main(String[] args) {
		Non_parametarize c=new Non_parametarize();
		c.display();
	}

}
