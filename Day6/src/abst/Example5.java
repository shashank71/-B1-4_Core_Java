package abst;

class Person
{
		void message()
		{
			System.out.println("Mahatma Gandhi");
		}
	}
class Example5 extends Person
{
	void message()
	{
		System.out.println("Who is the father of nation?");
	}
	void display()
	{
		message();
		super.message();
	}
}
class Main
{

	public static void main(String[] args) {
		Example5 s = new Example5();
		s.display();
	}

}