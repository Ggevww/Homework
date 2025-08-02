package homework9.task2;


/**
 * TestArrays is a class that tests the Arrays class.
 */
class TestArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.maxValueIndex(arr));
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.maxValueIndex(arr2));
        int[] arr3 = {1, 3, 2, 5, 4};
        System.out.println(Arrays.maxValueIndex(arr3));
    }
}
