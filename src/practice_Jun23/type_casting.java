package practice_Jun23;


class A{}
class B extends A{}

public class type_casting {
	public static void main(String[] args) {
		B b=new B();
		A a=b; //upcasting
		A aa=new B();
		B bb=(B) aa;//downcasting
	}

}

