package practice_June25;

public class Count_nof_elements_greater_than_the_Value {
	public static void main(String[] args) {
		int[] arr= {45,43,25,37,98,56,43,65,76,};
		int count=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>min) {
				count++;
			}
		}
		System.out.println(count);
	}
}
