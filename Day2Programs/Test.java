package day2;

class Parent{}
class Child1 extends Parent{}
class Child2 extends Parent{}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Parent p =new Parent();
	      Child1 c1 = new Child1();
	      Child2 c2 = new Child2();
	System.out.println(c1 instanceof Parent);		
	System.out.println(c2 instanceof Parent);		
	System.out.println(p instanceof Child1);		
	System.out.println(p instanceof Child2);		
	      p = c1;
	System.out.println(p instanceof Child1);		
	System.out.println(p instanceof Child2);		
	      p = c2;
	System.out.println(p instanceof Child1);		
	System.out.println(p instanceof Child2);	

	}

}

Output:

true
true
false
false
true
false
false
true

