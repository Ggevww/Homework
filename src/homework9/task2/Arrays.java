package homework9.task2;

/**
 * Arrays is a class that provides a static method to find the index of the maximum value in an array.
 * It demonstrates the use of static methods in Java.
 */
public class Arrays {
    /**
     * maxValue is a static method that returns the index of the maximum value in the given array.
     * @param arr the array to search for the maximum value
     * @return the index of the maximum value in the array
     */
    public static int maxValueIndex(int[] arr){
        int max = arr[0];
        int maxIndex = 0;
        int j = 0;
        for(int i: arr){
            if(i> max){
                max = i;
                maxIndex = j;
            }
            j++;
        }
        return maxIndex;
    }

}

/**
 * TestArray is a class that tests the Arrays class.
 */
class TestArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.maxValueIndex(arr));
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.maxValueIndex(arr2));
        int[] arr3 = {1, 3, 2, 5, 4};
        System.out.println(Arrays.maxValueIndex(arr3));
    }
}

