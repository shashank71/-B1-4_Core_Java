package Strings;

import java.util.Scanner;

public class Example2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		//String str = new String("Hello Everyone");
		String str = new String(s.nextLine());
		System.out.println(str);
		s.close();
	}
}
