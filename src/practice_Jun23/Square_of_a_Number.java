package practice_Jun23;

interface Square{
	int s(int num);
}

public class Square_of_a_Number {
	public static void main(String[] args) {
		Square ss=(num)->{
			return num*num;
		};
		System.out.println(ss.s(26032005));
		System.out.println(ss.s(7));
	}

}
