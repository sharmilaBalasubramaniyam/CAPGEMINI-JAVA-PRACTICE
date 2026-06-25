package practice_June25;

import java.util.Arrays;

public class Insert_element_at_end {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40};
		int insert=50;
				
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int[] arr1=Arrays.copyOf(arr,arr.length+1);
		arr1[arr.length]=insert;
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
}
