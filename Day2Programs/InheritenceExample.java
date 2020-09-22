package day2;


class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}
class Dog extends Animal{
	void eat(){
		System.out.println("I am eating");
	}
	void bark() {
		System.out.println("I am barking");
	}
}

public class InheritenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
	}

}
