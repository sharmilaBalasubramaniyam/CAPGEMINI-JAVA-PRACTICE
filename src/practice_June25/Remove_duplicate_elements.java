package practice_June25;

import java.util.*;

public class Remove_duplicate_elements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10,20,340,10,30,40,40,50,340));

        Set<Integer> unique = new LinkedHashSet<>(list);

        for(int num : unique) {
            System.out.println(num);
        }
    }
}