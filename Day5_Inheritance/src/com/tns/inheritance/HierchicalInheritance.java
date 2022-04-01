package com.tns.inheritance;

class Cars
{
	void BMW()
	{
		System.out.println("i like BMW");
	}
	void AUDI()
	{
		System.out.println("i like AUDI");
	}
}
class Vehicals extends Cars
{
	void R1()
	{
		System.out.println("i own R1");
	}
}
class Automobiles extends Cars
{
	void Truck()
	{
		System.out.println("i drive truck");
	}
	
}

public class HierchicalInheritance {

	public static void main(String[] args) {

		Vehicals v=new Vehicals();
		v.BMW();
		v.AUDI();
		v.R1();
		Automobiles a= new Automobiles();
		a.Truck();
	}

}
