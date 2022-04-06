package polymorphism;

public class FunctionOverLoading {
	void assign(int a)
	{
		System.out.println("Area of square: "+(a*a) );
	}
	void assign (int a, int b)
	{
		System.out.println("Area of Rectangle:" + (a*b));
	}
	public static void main(String[] args) {
		FunctionOverLoading o=new FunctionOverLoading();
		o.assign(5);
		o.assign(20, 6);
	}

}
