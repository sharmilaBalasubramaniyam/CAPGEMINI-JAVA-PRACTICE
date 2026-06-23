package practice_Jun23;


interface ConvertstrToUppercase{
	String csu(String str);
}

public class convert_string_to_uppercase {
	public static void main(String[] args) {
		ConvertstrToUppercase covstrupper=(str)->{
			return str.toUpperCase();
		};
		
		System.out.println(covstrupper.csu("Capgimini"));
		
	}
		
}

