package practice_Jun23;



interface reversedString{
	String reverse(String str);
}


public class Palindrome {
	public static void main(String[] args) {
		reversedString revstr=(str)->{
			String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev+=str.charAt(i);
			}
			return rev;
		};
		
		String str="madam";
		
		String reversed=revstr.reverse(str);
		if(str.equals(reversed)) {
		System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
}




