package practice_Jun29;

public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	int salary;
	
	@Override
	public Employee(int id,String name,float salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return "Employee [id="+ id +",name="+name+", salary = "+salary]
	}
	
	public int compareTo(Employee o) {
		
	}
}



// diff comparable vs comparator interface


//comparable - override compareTo method (for one property)
//comparator - compare method is avaliable compare(T e1, T e2)  (for multiple property)
