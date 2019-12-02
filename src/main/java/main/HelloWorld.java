package main;

public class HelloWorld {

	static String greeting = "Hello World! 2";

	public static void main(String[] args) {

		System.out.println("Hello World! 1");
		System.out.println(greeting);
		System.out.println(giveGreeting());
	}

	public static String giveGreeting(){
		return "Hello World! 3";
	}
}