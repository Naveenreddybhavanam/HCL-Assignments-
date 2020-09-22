package day2;

class A {
	
	public void greetings() {
		System.out.println("Hello, this is A...");
	}
	
}
class B extends A{
	
	public void wishes() {
		System.out.println("Hello, this is B...");
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.greetings();
		B b = new B();
		b.greetings();
		b.wishes();
	}

}
