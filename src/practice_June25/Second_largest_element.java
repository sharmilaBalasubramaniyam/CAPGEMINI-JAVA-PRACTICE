package practice_June25;

public class Second_largest_element {

    public static void main(String[] args) {

        int[] arr = {10, 20, 50, 40, 30};

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if(arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Second Largest Element: " + secondLargest);
    }
}