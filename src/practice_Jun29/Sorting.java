package practice_Jun29;

import java.util.*;

public class Sorting {
	public static void  main(String[] args) {
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(new Employee(144,"Suresh",45000));
		emps.add(new Employee(11,"Sumesh",55000));
		emps.add(new Employee(55,"Kavi",452000));
		
		
		System.out.println("Before sorting : "+emps);
		//Collections.sort(emps);
		
		emps.sort((o1,o2)->o1.name.compareTo(o2.name));
		for(Employee e:emps) {
			System.out.println(e);
		}
		        
	}
}
