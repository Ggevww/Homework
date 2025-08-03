package homework9.task6;

/**
 * This class provides a method to find the characters that are present in both input strings.
 * It returns a string containing the common characters without duplicates.
 */
public class SameChars {
    /**
     * Finds the characters that are present in both input strings.
     *
     * @param s1 the first input string
     * @param s2 the second input string
     * @return a string containing the common characters without duplicates
     */
    public static String getSameChars(String s1, String s2){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            if(s2.contains(String.valueOf(s1.charAt(i)))) {
                if (!result.toString().contains(String.valueOf(s1.charAt(i)))){
                    result.append(s1.charAt(i));
                }
            }
        }
        return result.toString();
    }
}

/**
 * This class contains a main method to demonstrate the functionality of the SameChars class.
 */
class TestSameChars {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String commonChars = SameChars.getSameChars(s1, s2);
        System.out.println("Common characters: " + commonChars);

        s1 = "abcde";
        s2 = "cdefg";
        commonChars = SameChars.getSameChars(s1, s2);
        System.out.println("Common characters: " + commonChars);
    }
}
