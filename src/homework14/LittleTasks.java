package homework14;

import java.util.ArrayList;

public class LittleTasks {
    /**
     * Generates a list containing the first n Fibonacci numbers.
     *
     * @param n the number of Fibonacci numbers to generate
     * @return an ArrayList containing the first n Fibonacci numbers
     */
    public ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> fibList = new ArrayList<>();
        if (n <= 0) {
            return fibList;
        }
        fibList.add(0);
        if (n == 1) {
            return fibList;
        }
        fibList.add(1);
        for (int i = 2; i < n; i++) {
            int nextFib = fibList.get(i - 1) + fibList.get(i - 2);
            fibList.add(nextFib);
        }
        return fibList;
    }
    /**
     * Sorts an array of integers in ascending order using the bubble sort algorithm.
     *
     * @param array the array of integers to sort
     * @return the sorted array
     */
    public int[] bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }
    /**
     * Counts the number of characters in a given string.
     *
     * @param str the string to count characters in
     * @return the number of characters in the string
     */
    public int countCharacters(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    /**
     * V 1, easy version
     * Checks if the parentheses in a given string are balanced.
     *
     * @param str the string to check
     * @return true if the parentheses are balanced, false otherwise
     */
    public boolean checkParentheses(String str) {
        int balance1 = 0;
        int balance2 = 0;
        int balance3 = 0;
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '(' -> balance1++;
                case ')' -> balance1--;
                case '{' -> balance2++;
                case '}' -> balance2--;
                case '[' -> balance3++;
                case ']' -> balance3--;
            }
            if (balance1 < 0 || balance2 < 0 || balance3 < 0) {
                return false;
            }
        }
        boolean result = balance1 == 0 && balance2 == 0 && balance3 == 0;
        return result;
    }
    /**
     * V 2, hard version
     * Checks if the parentheses in a given string are balanced.
     *
     * @param str the string to check
     * @return true if the parentheses are balanced, false otherwise
     */
    public boolean checkParentheses2(String str) {
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((ch == ')' && open != '(') ||
                        (ch == '}' && open != '{') ||
                        (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        LittleTasks tasks = new LittleTasks();
        int n = 10;
        ArrayList<Integer> fibonacciSequence = tasks.fibonacci(n);
        System.out.println("Fibonacci sequence of length " + n + ": " + fibonacciSequence);
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedArray = tasks.bubbleSort(array);
        System.out.print("Sorted array: " + java.util.Arrays.toString(sortedArray));
        String testString = "((a + b) * (c - d))";
        int charCount = tasks.countCharacters(testString);
        System.out.println("\nNumber of characters in \"" + testString + "\": " + charCount);
        String parenthesesString = "{[()]}";
        boolean areParenthesesBalanced = tasks.checkParentheses(parenthesesString);
        System.out.println("Are parentheses in \"" + parenthesesString + "\" balanced? " + areParenthesesBalanced);
        String parenthesesString2 = "{[(])}";
        boolean areParenthesesBalanced2 = tasks.checkParentheses2(parenthesesString2);
        System.out.println("Are parentheses in \"" + parenthesesString2 + "\" balanced? " + areParenthesesBalanced2);
        System.out.println("Little tests");

    }
}
