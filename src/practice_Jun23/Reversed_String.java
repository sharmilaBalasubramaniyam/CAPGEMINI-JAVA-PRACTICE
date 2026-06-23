package practice_Jun23;

interface reversedString{
	String reverse(String str);
}

public class Reversed_String {
	public static void main(String[] args) {
		reversedString revstr=(str)->{
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev+=str.charAt(i);
			}
			return rev;
		};
		System.out.println(revstr.reverse("Sharmila Balasubramnaiyam"));
	}

}
