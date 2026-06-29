package practice_Jun29;

public class Student {
	int id;
	String Name;
	int Marks;
	
	

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		Name = name;
		Marks = marks;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Marks=" + Marks + "]";
	}
}
