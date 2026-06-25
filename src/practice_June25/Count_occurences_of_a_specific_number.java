package practice_June25;

public class Count_occurences_of_a_specific_number {
	public static void main(String[] args) {
		int[] arr= {10,30,40,20,10,30,40,30,24,35,24,20,10,40};
		
		occurences(arr,10);
		occurences(arr,30);
		occurences(arr,40);
		occurences(arr,20);
		occurences(arr,24);
		occurences(arr,35);
		
	}


static void occurences(int[] arr,int num) {
	int count=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			count++;
		}
	}
	
	System.out.println("Count of "+num+" is "+count);
}
}
