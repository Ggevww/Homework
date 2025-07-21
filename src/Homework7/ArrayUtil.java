package Homework7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtil {
    public static void main(String[] args) {
        //1
        int[] n = {1,2,3,5,-5,6,-8,-125,65, -56, 18};
        printPositiveElements(n);
        //2
        short [] k = {218, 365, 486, 6416, 646, 102};
        System.out.println(Arrays.toString(reverseArray(k)));
        //3
        long[] z = {123456789L, -987654321L, 555555555L, 0L, 42L};
        System.out.println(biggestElement(z));
        //4
        float[] f = {3.14f, -2.71f, 0.0f, 1.618f, -1.414f};
        System.out.println(smallestElement(f));
        //5
        int[] m = {1, 2, 3, 4, 5};
        int[] copiedArray = copyArray(m);
        System.out.println(Arrays.toString(copiedArray));
        //6
        int[] array1 = {1, 5, 6, 4, 7};
        int[] array2 = {7, 4, 2, 3, 5};
        int[] array3 = sumOfArrays(array1, array2);
        System.out.println(Arrays.toString(array3));
        //7
        int[] array = {1, 5, 6, 4, 5};
        System.out.println(countOfNum(array, 5));
        //8
        int[] array8 = {1, 5, 6, 4};
        System.out.println(Arrays.deepToString(triplets(array8)));
        //9
        System.out.println(Arrays.toString(sortDescending(array8)));
        //10
        int[] array10 = {1, 5, 6, 4, 9, 7, 1};
        System.out.println(Arrays.toString(evensAtFirst(array10)));
        //11
        int[] array11 = {1, 0, 6, 4, 9, 0, 0};
        System.out.println(Arrays.toString(removeZeros(array11)));
        //12
        int[] array12 = {1, 5, 6, 12, 25, 7, 4, 9, 0, 4, 7, 7, 9, 1};
        System.out.println(Arrays.toString(longestIncreasingSubsequence(array12)));
        //13
        int[] binaryArray = {1, 1, 0, 0, 1, 0};
        System.out.println(binaryRepresentation(binaryArray));
        //14
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printAboveMainDiagonal(matrix);
        //15
        System.out.println(Arrays.deepToString(rotateMatrix(matrix)));
        //16
        int[][] squareMatrix = {
            {2, 4, 6},
            {1, 3, 5},
            {8, 10, 12}
        };
        System.out.println(checkRows(squareMatrix));





    }
    //1․ Գրել method, որը տպում է int[] n  array-ի դրական տարրերը․

    /**
     * Prints the positive elements of an integer array.
     * @param x
     */
    public static void printPositiveElements(int[] x){
        for(int i:x){
            if(i>0){
                System.out.println(i);
            }
        }
    }
    //2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
    //    Օրինակ՝ ( 257 -> 752)․

    /**
     * Reverses the elements of a short array by reversing the digits of each element.
     * @param x
     * @return An array of shorts with each element's digits reversed.
     */
    public static short[] reverseArray(short[] x){
        ArrayList<Short> y = new ArrayList<>();
        for (short i: x){
            String result = "";
            while (i != 0){
                result += String.valueOf(i%10);
                i/=10;
            }
            y.add(Short.parseShort(result));
        }
        short[] result = new short[y.size()];
        for (int i = 0; i < y.size(); i++){
            result[i] = y.get(i);
        }
        return result;
    }
    //3. Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը․

    /**
     * Finds the largest element in a long array.
     * @param x
     * @return The largest element in the array.
     */
    public static long biggestElement(long[] x) {
       long max = Long.MIN_VALUE;
       for(long i : x) {
           if (i > max) {
               max = i;
           }
       }
       return max;
    }
    //4. Գրել method, որը գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը․
    /**
     * Finds the smallest element in a float array.
     * @param x
     * @return The smallest element in the array.
     */
    public static float smallestElement(float[] x) {
        float min = Float.MAX_VALUE;
        for (float i : x) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    //5 ․ Գրել method, որը int[] n array-ի էլեմենտները տեղափոխում է int[] m  array-ի մեջ։
    /**
     * Copies elements from one integer array to another.
     * @param x
     * @return A new array containing the same elements as the input array.
     */
    public static int[] copyArray(int[] x) {
        int[] y = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
        return y;
    }



    //6․ Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է
    // array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։
    //
    //Oրինակ՝ array1 = {1,5,6,4,7}
    //                  array2 = {7,4,2,3,5}
    //
    //                  array3 = {8,9,8,7,12}

    /**
     * Sums the corresponding elements of two integer arrays and returns a new array with the results.
     * @param x
     * @param y
     * @return An array containing the sums of corresponding elements from x and y.
     */
     public static int[] sumOfArrays(int[] x, int[] y) {
        int[] array3 = new int[x.length];
        if (x.length != y.length) {
            System.out.println("Arrays must be of the same length.");
        }else{
            for (int i = 0; i < x.length; i++) {
                array3[i] = x[i] + y[i];
            }
        }

        return array3;
    }

    //7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։
    //
    //Oրինակ՝  array = {1,5,6,4,5}
    //                   k = 5;
    //                   // 2

    /**
     * Counts the occurrences of a specific integer k in an array.
     * @param array
     * @param k
     * @return The count of occurrences of k in the array.
     */
    public static int countOfNum(int[] array, int k){
        int count = 0;
        for(int i: array){
            if(i == k){
                count ++;
            }
        }
        return count;
    }

    //8․Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում թվերի դասավորությունը էական չէ:

    //Oրինակ՝  array = {1,5,6,4}

    // {1,5,6},  {1,5,4} ,{1,4,6}, {4,5,6}

    /**
     * Generates all unique triplets from an integer array.
     * @param x
     * @return A 2D array containing all unique triplets of elements from the input array.
     */
    public static int[][] triplets(int[] x){
        ArrayList y = new ArrayList<>();
        if(x.length < 3){
            System.out.println("Error, array doesn't contain 3 elements and more");
            return null;

        }else {
            int[] element = {x[0], x[1], x[2]};
            for (int i = 0; i < x.length - 2; i++) {
                for (int j = i + 1; j < x.length - 1; j++) {
                    for (int k = j + 1; k < x.length; k++) {
                        element[0] = x[i];
                        element[1] = x[j];
                        element[2] = x[k];
                        y.add(Arrays.copyOf(element, element.length));
                    }
                }
            }
        }
        int[][] result = new int[y.size()][3];
        for (int i = 0; i < y.size(); i++) {
            result[i] = (int[]) y.get(i);
        }
        return result;

    }
    //9․ Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
    /**
     * Sorts an integer array in descending order.
     * @param x
     * @return A new array sorted in descending order.
     */
    public static int[] sortDescending(int[] x) {
        int[] sortedArray = Arrays.copyOf(x, x.length);
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    int l = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = l;
                }
            }
        }
        return sortedArray;
    }

    //10․ Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:
    //
    //Oրինակ՝  array = {1,5,6,4,9,7,1}
    //
    //                  {6,4,1,5,9,7,1}

    /**
     * Rearranges an integer array so that all even numbers come first, followed by odd numbers.
     * @param y
     * @return A new array with even numbers at the beginning and odd numbers at the end.
     */
    public static int[] evensAtFirst(int[] y){
        int index1 = y.length-1;
        int index2 = 0;
        int[] x = new int[y.length];
        for (int j : y) {
            if (j % 2 == 0) {
                x[index2] = j;
                index2++;
            } else {
                x[index1] = j;
                index1--;
            }
        }
        return x;

    }
    //11․ Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
    //
    //Oրինակ՝  array = {1,0,6,4,9,0,0}
    //
    //                  {1,6,4,9}

    /**
     * Removes all zero elements from a float array.
     * @param x
     * @return A new array containing only the non-zero elements of the input array.
     */
    public static int[] removeZeros(int[] x){
        ArrayList <Integer> result = new ArrayList<>();
        for(int i: x){
            if(i != 0){
                result.add(i);
            }
        }
        int[] y = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            y[i] = result.get(i);
        }
        return y;
    }

    //12․ Տպել տրված թվերի հաջորդականության ամենաերկար աճող ենթահաջորդականությունը:
    //
    //Oրինակ՝  array = {1,5,6,4,9,0,4,7,7,9, 1}
    //
    //                   // {0,4,7,7,9}

    /**
     * Finds the longest increasing subsequence in an integer array.
     * @param array
     * @return An array containing the longest increasing subsequence.
     */
    public static int[] longestIncreasingSubsequence(int[] array) {
        if (array.length == 0) return new int[0];
        int currentLength = 1;
        int currentStart = 0;
        int maxLength = 1;
        int maxStart = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = currentStart;
                }
                currentLength = 1;
                currentStart = i + 1;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStart = currentStart;
        }
        int[] result = new int[maxLength];
        System.arraycopy(array, maxStart, result, 0, maxLength);
        return result;
    }

    //13․ Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված զանգված և
    // արտածել n  թվի 10-ական ներկայացումը:
    //
    //Oրինակ՝    array = {1,1,0,0,1,1}
    //51
    /**
     * Converts a binary representation of an integer array to its decimal equivalent.
     * @param x
     * @return The decimal representation of the binary array.
     */
    public static int binaryRepresentation(int[] x) {
        int result = 0;
        for(int i: x){
            result = 2 * result + i;
        }

        return result;

    }

    //14․ Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:
    /**
     * Prints the elements of a matrix that are above the main diagonal.
     * @param matrix
     */
    public static void printAboveMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > i) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    //15․ Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:
    /**
     * Rotates a square matrix 90 degrees clockwise.
     * @param matrix
     * @return The rotated matrix.
     */
    public static int[][] rotateMatrix(int[][] matrix) {
        if(matrix.length == matrix[0].length) {
            int n = matrix.length;
            int[][] rotated = new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    rotated[i][j] = matrix[n-j-1][n-i-1];
                }
            }
            return rotated;
        }else{
            System.out.println("Error, matrix is not square");
            return null;
        }

    }
    //16․ Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES,
    // եթե նրա բոլոր տողերի տարրերի գումարը զույգ է։  NO հակառակ դեպքում։

    /**
     * Checks if the sum of all elements in each row of a matrix is even.
     * @param matrix
     * @return "YES" if the sum is even, "NO" otherwise.
     */
    public static String checkRows(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        if(sum%2 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }




}
