package practice_June25;

public class Insert_element_at_given_position {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};

		int pos = 4;
		int insert = 50;

		int[] newArr = new int[arr.length + 1];

		for(int i = 0; i < pos; i++) {
			newArr[i] = arr[i];
		}

		newArr[pos] = insert;

		for(int i = pos; i < arr.length; i++) {
		     newArr[i + 1] = arr[i];
		 }

		 for(int num : newArr) {
		     System.out.print(num + " ");
		 }
	 }
}
