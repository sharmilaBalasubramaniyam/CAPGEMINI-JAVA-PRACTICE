package practice_June25;

public class Leader_Elements {
	public static void main(String[] args) {
		
		int[] arr= {10,30,40,50,67};
		
		for(int i=0;i<arr.length;i++) {

		    boolean leader=true;

		    for(int j=i+1;j<arr.length;j++) {

		        if(arr[j]>arr[i]) {

		            leader=false;
		            break;
		        }
		    }

		    if(leader)
		        System.out.print(arr[i]+" ");
		}
	}
}
