package practice_June25;

public class Average_of_Array_Elements {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int sum=0;
		
		for(int num:arr) {
			sum+=num;
		}
		System.out.println((double)sum/arr.length);
		
	}
}
