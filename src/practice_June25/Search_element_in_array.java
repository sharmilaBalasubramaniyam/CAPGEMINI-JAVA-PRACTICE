package practice_June25;

public class Search_element_in_array {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		
		int search=50;
		
		for(int i=0;i<arr.length;i++) {
			if(search==arr[i]) {
				System.out.println("The Searched Element index is "
			+i+" and the Searched Element is "+search);
			}
		}
	}
}



//static void search(int[] arr,int key) {
//	System.out.println("Element found index = "+Arrays.binarySearch(arr,key));
//}
//
//public class Search_element_in_array{
//	public static void main(String[] args) {
//		int[] arr= {10,20,30,40,50,60,70,80,90,100};
//		search(arr,80);
//	}
//}
