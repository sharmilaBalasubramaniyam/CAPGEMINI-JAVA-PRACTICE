package practice_June25;

public class Count_Even_and_Odd_Numbers {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,98,99,77};
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
		}
		System.out.println("Even Numbers Count : "+even_count);
		System.out.println("Odd Numbers Count :"+odd_count);
	}
}
