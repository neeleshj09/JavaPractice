package Package1;

public class day4_assignemnt {

	public day4_assignemnt() {
		this(5,10,20);
		System.out.println("default constructor");
	}
	
	public day4_assignemnt(int a) {
		this();
		System.out.println("one parameterized constructor");
	}
	
	public day4_assignemnt(int a, int b) {
		this(10);
		System.out.println("two parameterized constructor");
	}
	
	public day4_assignemnt(int a, int b, int c) {
		System.out.println("three parameterized constructor");
	}
	
	public day4_assignemnt(int a, int b, int c, int d) {
		this(5,10);
		System.out.println("four parameterized constructor");
	}
	
	public static void main(String[] args) {
		day4_assignemnt ref = new day4_assignemnt(5,10,15,20);
	}
}
