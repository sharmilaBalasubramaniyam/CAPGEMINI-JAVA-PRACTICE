package practice_Jun29;

import java.util.*;

public class Set_Example {
	public static void main(String[] args) {
		Set<String> cities =new HashSet<String>();
		cities.add("Salem");
		cities.add("Erode");
		cities.add("Karur");
		cities.add("Salem");
		System.out.println(cities);
		Set<Integer> nos=new TreeSet<Integer>();
		nos.add(50);
		nos.add(40);
		nos.add(30);
		nos.add(20);
		nos.add(10);
		System.out.println(nos);
	}
}
