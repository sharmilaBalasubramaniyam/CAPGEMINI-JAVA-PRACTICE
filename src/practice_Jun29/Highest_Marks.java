package practice_Jun29;

import java.util.*;

public class Highest_Marks {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(88,"Sharmila",98));
		list.add(new Student(50,"Mohan",100));
		list.add(new Student(1,"Mola",100));
		
		list.sort((o1,o2)->{
			if(o1.Marks>o2.Marks)
				return -1;
			if(o1.Marks>o2.Marks)
				return 1;
			
			if(o1.Marks==o2.Marks) {
				if(!o1.Name.equals(o2.Name)) {
					return o1.Name.length()-o2.Name.length();
				}else {
					if(o1.id>o2.id)
						return -1;
					if(o1.id<o2.id)
						return 1;
				}
			}
			

		}
		
	}
}
