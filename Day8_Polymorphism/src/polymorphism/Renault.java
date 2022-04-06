package polymorphism;

public class Renault {
	String color;
	int speed;
	Renault()
	{
		System.out.println("Bought renault in 2020");
	}
	Renault(String color,int speed)
	{
		this.color=color;
		this.speed=speed;
	}
	public static void main(String[] args) {
		Renault r = new Renault();
		Renault k = new Renault("red",50);
		System.out.println(k.color+" "+k.speed);
	}

}
