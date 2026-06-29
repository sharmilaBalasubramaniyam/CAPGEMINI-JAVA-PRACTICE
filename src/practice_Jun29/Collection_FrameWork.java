package practice_Jun29;

import java.util.ArrayList;

public class Collection_FrameWork {
	public static void main(String[] args) {
		ArrayList lists=new ArrayList();
		lists.add(new String("Hello"));
		lists.add(new Integer(420));
		lists.add("Nandha");
		lists.add(2020);
		lists.add(new Float(44.55));
		System.out.println("1st Index "+lists.get(1));
		System.out.prinltn("Size "+lists.size());
		System.out.println("Check "+lists.isEmpty());
		lists.remove(1);
		System.out.println(lists);
	}
}


// :: - method reference operatord
