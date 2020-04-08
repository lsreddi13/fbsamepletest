package Javapractise;

public class FirstTest {
	static String emp_name = "Pavan";
	static String game = "football";
	
	public static void main(String[] args) {
		System.out.println("Welcome!!");

		String name = "Ashok";
		int age = 30;
		System.out.println("Ashok : " + "30");
		System.out.println(name + " : " + age);

		testMe();
		testYou();
		
		Test2Java abc = new Test2Java();
		abc.add();
	}
	
	public static void testMe() {
		int age = 55;
		System.out.println("Hello!!  "+emp_name + "  age "+age );
		
	}
	
	public static void testYou() {
		
		System.out.println("Playing :)" + game);
	}
}
