package practice_June25;

public class Right_Rotate_Array_by_One {
	public static void main(String[] args) {
		int[] arr= {40,50,60,780,56,37,86,45,98};
		
		int last = arr[arr.length-1];

		for(int i=arr.length-1;i>0;i--) {
		    arr[i] = arr[i-1];
		}

		arr[0] = last;
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
	}
}
