package homework9.task8;

/**
 * This class provides a method to convert an integer to its binary representation.
 */
public class Binary {
    /**
     * Converts an integer to its binary representation.
     *
     * @param num the integer to convert
     * @return a string representing the binary form of the integer
     */
    final public static String toBinar(int num){
        StringBuilder bin = new StringBuilder();
        while (num > 0){
            bin.append(num%2);
            num /= 2;
        }
        return bin.reverse().toString();
    }
}

/** * Test class for Binary conversion.
 */
class TestBinary {
    public static void main(String[] args) {
        System.out.println(Binary.toBinar(19));
    }
}


