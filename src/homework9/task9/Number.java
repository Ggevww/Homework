package homework9.task9;

import java.util.ArrayList;

/**
 * This class provides a method to filter even numbers from an array.
 */
public class Number {
    /**
     * Filters even numbers from the given array.
     *
     * @param array the input array of integers
     * @return an array containing only the even numbers from the input array
     */
    public static int[] evenNums(int[] array){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : array){
            if(i%2 == 0){
                result.add(i);
            }
        }
        int[] evens = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            evens[i] = result.get(i);
        }
        return evens;
    }
}


