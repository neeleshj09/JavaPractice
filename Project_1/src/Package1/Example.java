package Package1;

public class Example {

	int a;
	
	public void display()
	{
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		ex.display();
		ex.a = 125;
		System.out.println(ex.a);
	}
}
