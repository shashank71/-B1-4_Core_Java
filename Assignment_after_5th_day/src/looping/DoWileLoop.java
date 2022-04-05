package looping;
import java.util.Scanner;
public class DoWileLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=n;
		do
		{
			System.out.println("x:" +x);
			x++;
		}
		while(x<40);
		s.close();
	}

}
