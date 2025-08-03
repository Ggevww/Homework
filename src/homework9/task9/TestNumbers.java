package homework9.task9;


public class TestNumbers {
    public static void main(String[] args) {
        int[] test = {6 , 15, 54, 354, 87, 36, 24, 65};
        int[] evens = Number.evenNums(test);
        System.out.print("Even numbers: ");
        for (int i : evens) {
            System.out.print(i + " ");
        }
    }
}
