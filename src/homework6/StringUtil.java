package homework6;

import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {
        //1
        System.out.println("Task 1");
        System.out.println(concat(2));
        //2
        System.out.println("Task 2");
        System.out.println(newWordNewLineV1("Hello my dear friends, how are you"));
        System.out.println(newWordNewLineV2("Բարև ձեզ սիրելի ընկերներ, ինչպես եք"));
        //3
        System.out.println("Task 3");
        System.out.println(reverse("reverse word"));
        //4
        System.out.println("Task 4");
        System.out.println(countSubString("We are living in an yellow submarine. We don't  have anything", "in"));
        //5
        System.out.println("Task 5");
        StringBuilder test = new StringBuilder("testing");
        String test2 = "hzor testing";
        System.out.println(toUpperCase(test2));
        System.out.println(toUpperCase(test));
        //6
        System.out.println("Task6");
        print20LengthLine();
        //7
        System.out.println("Task 7");
        StringBuilder test3 = new StringBuilder("We are living in an yellow submarine. We don't  have anything");
        String test4 = "We are living in an yellow submarine. We don't  have anything";
        System.out.println(removeA(test4));
        System.out.println(removeA(test3));
        System.out.println(remove_a(test4));
        //8
        System.out.println("Task 8");
        System.out.println(aToStar(test4));
        //9
        System.out.println("Task 9");
        System.out.println(longestWord(test4));
        //10
        System.out.println("Task 10");
        System.out.println(firstIndexOf("a", test4));
        //11
        System.out.println("Task 11");
        printSubLine(test4, 3);
        printSubLine(test3, 5);
        //12
        System.out.println("Task 12");
        System.out.println(isNotEmpty(""));
        System.out.println(isNotEmpty(null));
        System.out.println(isNotEmpty("Hello World"));
        //13
        System.out.println("Task 13");
        System.out.println(longestWordBySymbol(test4, ','));
    }
    //1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
    //   1.1     “hello” , “world”
    //   1.2     1 , 2 , “hello”
    //   1.3     “1” , 2 , “hello”
    //   1.4     “hello”, 1 ,2, “world”

    /**
     *
     * @param x index of result
     * @return concatenation of some parameters by index
     */
    public static String concat(int x){
        return switch (x) {
            case 1 -> "hello " + "world";
            case 2 -> 1 + 2 + "hello";
            case 3 -> "1" + 2 + "hello";
            case 4 -> "hello" + 1 + 2 + "world";
            default -> "Please write right index";
        };
    }

    //2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ
    // սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․

    //1 Version

    /**
     * Replaces every space in the given string with a newline character.
     * @param x input string
     * @return a new string where each space is replaced by '\n'
     */
    public static String newWordNewLineV1(String x){
        StringBuilder y = new StringBuilder(x);
        int length = y.length();
        for (int i = 0; i < length; i++){
            if(x.charAt(i) == ' '){
                y.setCharAt(i, '\n');
            }
        }

        return y.toString();
    }

    //2 Version
    public static String newWordNewLineV2(String x){
        return x.replace(" ", "\n");
    }


    //3․ Գրել method (reverse), որը  շուռ է տալիս String.
    //    actual:   “sample”
    //    result:  “elpmas”

    /**
     * Reverses the characters in the given string.
     * @param x input string
     * @return new string with characters in reverse order
     */
    public static String reverse(String x){
        int length = x.length();
        StringBuilder y = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--){
            y.append(x.charAt(i));
        }

        return y.toString();

    }

    //4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.
    //
    //   int countSubString(String line, String token)
    //   token = “in”  ,    line =  “We are living in an yellow submarine. We don't  have anything”
    //   4 անգամ

    /**
     * Counts how many times the token appears in the given line
     * @param line the string to search within
     * @param token the substring to count
     * @return the number of times token appears in line
     */
    public static int countSubString(String line, String token){
       int count = 0;
       for (int i = 0;i < line.length()-token.length(); i++){
           if(line.startsWith(token, i)){
               count ++;

           }
       }
       return count;
    }

    //5․  Գրել method, որը  տեքստը սարքում է մեծատառերով գրված, օգտագործելով String.
    //    Նույնը  խնդիրը   StringBuilder-ով.
    //
    //actual:   “hello world”
    //result:  “HELLO WORLD”

    /**
     * Converts the entire input text to uppercase
     * @param text input string
     * @return an all‑uppercase copy of text
     */
    public static String toUpperCase(String text){
        return text.toUpperCase();
    }
    public static String toUpperCase(StringBuilder text){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            result.append(Character.toUpperCase(c));
        }
        return result.toString();
    }

    //6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի
    //երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
    //actual:   “Armenia”
    //result:  “Armenia*************”

    /**
     * Reads a string from the console, and prints it as a 20-character string.
     * If the input string is shorter than 20 characters, it will be padded with '*'.
     * If the input is 20 or more characters, method will be called one more time.
     */
    public static void print20LengthLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (max 20 chars): ");
        String input = scanner.nextLine();
        if (input.length() < 20) {
            int stars = 20 - input.length();
            System.out.println(input + "*".repeat(stars));
        } else {
            print20LengthLine();
        }
    }

    //7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները. Նույնը խնդիրը  StringBuilder-ով.
    //actual:  “We are living in a yellow submarine. We don't  have anything”
    //result:  “We re living in n yellow submrine. We don't  hve nything”

    /**
     * removes all "a" characters from the given string
     * @param text input string
     * @return a new string without "a" character
     */
    //1 Version
    public static String removeA(String text){
        return text.replace("a", "");
    }
    //2 Version
    public static String removeA(StringBuilder text){
        for(int i = text.length()-1; i >= 0; i--){
            if(text.charAt(i) == 'a'){
                text.delete(i, i+1);
            }
        }
        return text.toString();
    }
    //3 Version
    public static String remove_a(String text){
        StringBuilder sb = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != 'a') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    //8. Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.
    //actual:  “We are living in a yellow submarine. We don't  have anything”
    //result:  “We *re living in *n yellow subm*rine. We don't  h*ve *nything”

    /**
     * replaces all characters 'a' in the given text with '*'
     * @param text input string
     * @return a new string with 'a' replaced by '*'
     */
    public static String aToStar(String text){
        return text.replace("a", "*");
    }

    //9. Գրել method, որը գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով.
    //actual:  “We are living in an yellow submarine. We don't  have anything”
    //result:  submarine

    /**
     * Finds the longest word in the given text.
     * @param text the input string containing words separated by spaces
     * @return the longest word in the text
     */
    public static String longestWord(String text) {
        int maxLen = 0;
        int maxStart = 0;
        int currLen = 0;
        int currStart = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                if (currLen == 0) {
                    currStart = i;
                }
                currLen++;


            } else {
                if (maxLen < currLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                }
                currLen = 0;
            }
            }


            return text.substring(maxStart, maxStart + maxLen);

    }


    //10․ Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c  սիմվոլը.
    //actual:  String c = “a”  ,  “We are living in an yellow submarine. We don't  have anything”
    //result:  index 3

    /**
     * Finds the first index of the character c in the given text.
     * @param c the character to search for
     * @param text the string to search within
     * @return the index of the first occurrence of c in text
     */
    public static int firstIndexOf(String c, String text) {
        return text.indexOf(c);
    }

    //11․ Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը,
    // օգտագործելով String. Նույնը խնդիրը  StringBuilder-ով.
    //void printSubLine(String line, int n)
    //void printSubLine(StringBuilder line, int n)

    /**
     * Prints a substring of the given line from the start to the n-th index.
     * @param line the input string
     * @param n the index up to which the substring is printed
     */
    public static void printSubLine(String line, int n){
        System.out.println(line.substring(0, n));
    }public static void printSubLine(StringBuilder line, int n){
//        System.out.println(line.substring(0, n));
        for(int i = 0; i < n && i < line.length(); i++){
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    //12. Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ․
    /**
     * Checks if the given string is neither null nor empty.
     * @param str the string to check
     * @return {@code true} if str is not null and not empty, {@code false} otherwise
     */
    public static boolean isNotEmpty(String str) {
        return str != null && !str.isEmpty();
    }

    //13. Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը ․
    //actual:  “We, are, living, in an, yellow, submarine, We don't,  have anything”
    //result:    have anything
    /**
     * Finds the longest word in a string that is split by a specified symbol.
     * @param text the input string
     * @param symbol the character used to split the string
     * @return the longest word found in the string
     */
    public static String longestWordBySymbol(String text, char symbol) {
        StringBuilder newText = new StringBuilder(text.replace(' ', symbol));
        System.out.println(newText);
        int maxLen = 0;
        int maxStart = 0;
        int currLen = 0;
        int currStart = 0;
        for (int i = 0; i < newText.length(); i++) {
            if (newText.charAt(i) != symbol) {
                if (currLen == 0) {
                    currStart = i;
                }
                currLen++;


            } else {
                if (maxLen < currLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                }
                currLen = 0;
            }
        }

        String result = newText.toString();
        return result.substring(maxStart, maxStart + maxLen);

    }







}
