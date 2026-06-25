package practice_June24;

public class string_methods {
	public static void main(String[] args) {
		String str="  NaNDHa EngiNEERing COlleGe , Perundurai, Erode -pincode  ";
		
		str.concat("Perundurai, Erode");
		
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('a'));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.trim());
		System.out.println(str.replace("-pincode","pin code 638 052"));
		System.out.println(str.substring(6,12));
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str.equals("sharmila"));
		System.out.println(str.equalsIgnoreCase("Nandha Engineering college, perundurai, erode -pincode"));	
		System.out.println(str.contains("E"));
		System.out.println(str.compareTo("College"));
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);

		
	}
}
