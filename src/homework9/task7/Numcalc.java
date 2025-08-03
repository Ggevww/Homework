package homework9.task7;

import java.util.Random;

/**
 * This class provides a method to calculate the factorial of a given number using recursion.
 */
public class Numcalc {
    /**
     * Calculates the factorial of a given number.
     *
     * @param num the number to calculate the factorial for
     * @return the factorial of the given number
     */
    public static int factorial(int num){
        if(num == 1){
            return 1;
        }else {
            return num * factorial(num - 1);
        }
    }

}

/**
 * This class contains a main method to demonstrate the functionality of the Numcalc class.
 * It generates a random number between 1 and 10 and calculates its factorial.
 */
class TestNumcalc {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10)+1;
        System.out.println(number);
        System.out.println(Numcalc.factorial(number));
    }
}

