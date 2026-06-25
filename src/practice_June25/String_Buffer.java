package practice_June25;

public class String_Buffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("q");        
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
