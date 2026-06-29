package practice_Jun29;
import java.util.*;
import java.util.Map.Entry;

public class Map_Example {
	public static void main(String[] args) {
		Map<String,Integer> pairs=new HashMap<>();
		pairs.put("first", 220);
		pairs.put("second", 230);
		pairs.put("third", 240);
		pairs.put("fourth", 250);
		pairs.put("five", 260);
		
		int x=pairs.get("third");
		Set<String> keys =pairs.keySet(); // returns the only avaliable keys , 
		//return types is set
		
		System.out.println(keys);
		
		Collection<Integer> values=pairs.values();  // returns  only avaliable values,
		//return type is collection because the keys are unique so we use set values may 
		//contains the duplicates so it is collection return type
		
		System.out.println(values);
		
		
		Set<Entry<String,Integer>> both=pairs.entrySet();// entry is a inner interface (one entry=one element with the map) , return both key and values
		System.out.println(both);
	}
	}

