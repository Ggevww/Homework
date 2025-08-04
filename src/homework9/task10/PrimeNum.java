package homework9.task10;

/**
 * PrimeNum class provides methods to check if a number is prime
 * and to find the next prime number after a given number.
 */
public class PrimeNum {
    /**
     * Checks if a number is prime.
     *
     * @param num the number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(long num){
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    /**
     * Finds the next prime number after a given number.
     *
     * @param num the number to start searching from
     * @return the next prime number after num
     */
    public static long nextPrimeNum(long num){
        if(num == 2){
            return 3;
        }
        long result = num +2;
        while(!isPrime(result)){
            result += 2;
        }
        return result;
    }

}

/**
 * Test class for PrimeNum
 */
class TestPrimeNum{
    final static long x = 2;

    public static void main(String[] args) {
        System.out.println(PrimeNum.isPrime(x));
        System.out.println(PrimeNum.nextPrimeNum(x));
    }
}

