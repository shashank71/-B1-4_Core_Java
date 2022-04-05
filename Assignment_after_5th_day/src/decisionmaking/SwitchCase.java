package decisionmaking;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("Shashank");
			case 2:
				System.out.println("Hello");
				break;
			case 3:
				System.out.println("Ram");
				break;
			case 4:
				System.out.println("pavan");
				break;
			default:
				System.out.print("Invalid data");
				s.close();		
		}
	}

}
