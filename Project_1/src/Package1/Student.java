package Package1;

public class Student {
	int rollNo;
	int age;
	
	public void display1() {
		System.out.println("welcome to all of you");
	}

	public void display2() {
		System.out.println("automation is very easy");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.display1();
		std.display2();
		std.rollNo = 120;
		std.age = 25;
		System.out.println("roll number is "+ std.rollNo);
		System.out.println("age is "+ std.age);
	}
}
