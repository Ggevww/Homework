package homework12.test;

import homework12.ExceptionsUtil;
import homework12.exception.NewException;

import static homework12.ExceptionsUtil.*;

public class TestExceptions {
    public static void main(String[] args) {
        //1
        try {
            int number = 0;
            System.out.println("Reciprocal: " + reciprocal(number));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //2
        sumOfArray();
        //3
        try {
            int a = 10;
            int b = 0;
            System.out.println("Division: " + ExceptionsUtil.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //4
        ExceptionsUtil.readFile("test.txt");
        //5
        squareRoot();
        //6
        try{
            throwCustomExceptions(2);
        }catch (NewException e){
            System.out.println("Caught NewException");
        }
        //7
        try {
            validateAge(121);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
