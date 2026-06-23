package practice_Jun23;


@FunctionalInterface
interface Calculator{
	int calc(int a,int b);
	String toString();
	default void print() {
		System.out.println("this functional interface can contain all of these properties");
	}
}
class Abcd implements Calculator{
	@Override
	public int calc(int a,int b){
		return a+b;
	}
}


public class Calculator_interface {
	public static void main(String[] args) {
		Calculator c1=new Abcd();
		System.out.println("Functional interface : "+c1.calc(10, 20));
		Calculator c2=new Calculator() {
			public int calc(int a,int b) {
				return a-b;
			}
		};
		Calculator c3=(a,b)-> {
			return a*b;
		};
		System.out.println("Anonymous Function : "+c2.calc(20,10));
		System.out.println("Lambda Function : "+c3.calc(10,20));
	}
}
