package practice_June25;

public class Left_Rotate_Array_by_Once {
	public static void main(String[] args) {
		int[] arr= {10,50,40,20,50,68,78};
		
		int first=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}
}
