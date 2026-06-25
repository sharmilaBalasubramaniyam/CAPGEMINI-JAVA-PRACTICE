package practice_June24;

import java.util.*;

public class Count_vowels_consonants_digits_specialCharacters_in_string {
	public static void main(String[] args) {
		Scanner ms=new Scanner(System.in);
		
		String str=ms.nextLine();
		int vow=0;
		int con=0;
		int digits=0;
		int special_ch=0;
		String vows="aeiouAEIOU";
		
		char[] ch_values=str.toCharArray();
		
		for(char ch:ch_values) {
			if(vows.contains(String.valueOf((ch)))) {
				vow++;
			}else if(Character.isDigit(ch)) {
				digits++;
			}else if(Character.isLetter(ch) && !"aeiouAEIOU".contains(String.valueOf(ch))) {
				con++;
			}else {
				special_ch++;
			}
		}
		
		System.out.println("Vowels Count: "+vow);
		System.out.println("Consonantss Count: "+con);
		System.out.println("Digits Count: "+digits);
		System.out.println("Sepecial Characters Count: "+special_ch);
		
	}
}
