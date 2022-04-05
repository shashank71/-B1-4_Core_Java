package com.tns.scanner;
import java.util.Scanner;
public class Example {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("can donate the blood");
		}
		else
		{
			System.out.println("cannot donate");
		}
		s.close();
	}

}
