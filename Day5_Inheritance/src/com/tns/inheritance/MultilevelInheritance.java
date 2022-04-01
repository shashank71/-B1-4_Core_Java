package com.tns.inheritance;

class R6
{
	void print()
	{
		System.out.println("blue R6");
	}
}
class R3 extends R6
{
	void display()
	{
		System.out.println("black R3");
	}
}
class R15 extends R3
{
	void assign()
	{
		System.out.println("yellow R6");
	}
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		R15 r = new R15();
		r.display();
		r.print();
		r.assign();
	}

}
