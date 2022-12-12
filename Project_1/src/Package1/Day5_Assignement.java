package Package1;

public class Day5_Assignement {

	public void m1()
	{
		this.m4(1, 2, 3);
		System.out.println("default method");
		this.m2(1);
		this.m3(1, 2);
		this.m5(1, 2, 3, 4);
	}
	
	public void m2(int a)
	{
		System.out.println("one parameterized method");
	}
	
	public void m3(int a, int b)
	{
		System.out.println("two parameterized method");
	}
	
	public void m4(int a, int b, int c)
	{
		System.out.println("three parameterized method");
	}
	
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("four parameterized method");
	}
	
	public static void main(String[] args) {
		Day5_Assignement obj = new Day5_Assignement();
		obj.m1();
	}
}
