package practice_June25;

public class Print_Elements_at_Even_Positions {
	public static void main(String[] args) {
		int[] arr= {10,20,50,40,40,50,70};
		
		System.out.println("elements at even Position");
		
		for(int i=0;i<arr.length;i+=2) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Elements are printed after 3 values");
		
		for(int i=0;i<arr.length;i+=3) {
			System.out.print(arr[i]+" ");
		}
	}
}
