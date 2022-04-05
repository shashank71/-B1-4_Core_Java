package loops;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int y=1;y<=n;y++)
		System.out.println("Value of y:" + y);
		s.close();
	}
}
