package practice_June25;

public class Maximum_Frequency_Element {

    public static void main(String[] args) {

        int[] arr = {10,20,10,30,20,10,40};

        int maxElement = arr[0];
        int maxFreq = 0;

        for(int i = 0; i < arr.length; i++) {

            int count = 0;

            for(int j = 0; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Maximum Frequency Element: " + maxElement);
        System.out.println("Frequency: " + maxFreq);
    }
}