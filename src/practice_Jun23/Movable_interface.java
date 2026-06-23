package practice_Jun23;


interface Movable{
	void move();
}

class Car implements Movable{
	@Override
	public void move() {
		System.out.println("Car is running on the road");
	}
	
}

class Robot implements Movable{
	@Override
	public void move() {
		System.out.println("The Robot is moving as per the commands");
	}
	
}


public class Movable_interface {
	public static void main(String[] args) {
		Movable car=new Car();
		Movable robot=new Robot();
		
		car.move();
		robot.move();
	}
}
