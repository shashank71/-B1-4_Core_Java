package polymorphism;

public class FunctionOverLoading1 {
	void assign(int a, int b)
	{
		System.out.println("Area of square: "+(a*a) );
	}
	void assign ( float b)
	{
		System.out.println("Area of Rectangle:" + (float)(b*b));
	}
	public static void main(String[] args) {
		FunctionOverLoading o=new FunctionOverLoading();
		o.assign(5 ,10);
		o.assign(6);
	}

}
