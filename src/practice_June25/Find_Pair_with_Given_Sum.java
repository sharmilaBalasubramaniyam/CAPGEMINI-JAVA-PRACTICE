package practice_June25;

public class Find_Pair_with_Given_Sum {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,15,40,10};
		int target=50;

		for(int i=0;i<arr.length;i++) {

		    for(int j=i+1;j<arr.length;j++) {

		        if(arr[i]+arr[j]==target) {

		            System.out.println(arr[i]+" "+arr[j]);
		        }
		    }
		}
	}
}
