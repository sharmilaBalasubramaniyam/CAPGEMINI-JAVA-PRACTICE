package practice_June25;

public class Find_max_and_min_values {
	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,50,60};
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}else {
				System.out.println("There is no min and max values in the array");
			}
		}
		
		System.out.println("Maximum value : "+max);
		System.out.println("Minimum value : "+min);
	}
	
	
}

//demonstrate the use of continue,break,and return using a program

// count occurrences of a specific number

// remove duplicate elements

//find common elements between 2 array


