package operator;
import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		s.close();
	}
}
