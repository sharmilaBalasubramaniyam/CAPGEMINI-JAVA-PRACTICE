package practice_Jun23;

interface StringLength{
	int strlam(String str);
}

public class string_length_using_lambda {
	public static void main(String[] args) {
		StringLength strlambda=(str)->{
			return str.length();
		};
		
		System.out.println(strlambda.strlam("Capgimini"));
		
	}
		
}

