package Package1;

public class Day3_Assignment1 {

	public int sum(int a1, int a2)
	{
		int a3 = a1+a2;
		System.out.println("sum result is "+ a3);
		return a3;
	}
	
	public int sub(int b1, int b2)
	{
		int b3 = b1-b2;
		System.out.println("Sub result is "+ b3);
		return b3;
	}
	
	public int mult(int c1, int c2)
	{
		int c3 = c1*c2;
		System.out.println("multiplication is "+ c3);
		return c3;
	}
	
	public int div(int d1, int d2)
	{
		int d3 = d1/d2;
		System.out.println("div result is "+ d3);
		return d3;
	}
	
	public static void main(String[] args) {
		Day3_Assignment1 result = new Day3_Assignment1();
		// Assignment 1
		int temp1 = result.sum(10, 2);
		int temp2 = result.sum(temp1, 2);
		int temp3 = result.sub(temp2, 2);
		int temp4 = result.mult(2,temp3);
		int temp5 = result.div(temp4, 2);
		System.out.println("First Assignment output is "+ temp5); 
		// Assignment 2
		int tem1 = result.mult(10, 2);
		int tem2 = result.sub(tem1, 2);
		int tem3 = result.sum(tem2, 2);
		int tem4 = result.sub(tem3, 2);
		int tem5 = result.div(tem4, 2);
		System.out.println("second assignment output is "+ tem5);
	}
	
}

