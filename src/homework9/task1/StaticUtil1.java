package homework9.task1;

/**
 * StaticUtil1 is a class that provides static methods to access and modify a private static variable.
 * It demonstrates the use of static methods and variables in Java.
 */
public class StaticUtil1 {
    private static int a = 10;

    /**
     * getA is a static method that returns the value of the private static variable a.
     * @return the value of a
     */
    public static int getA(){
        return a;
    }

    /**
     * setA is a static method that sets the value of the private static variable a.
     * @param value the new value to set for a
     */
    public static void setA(int value) {
        a = value;
    }
}

/**
 * TestStaticUtil1 is a class that tests the StaticUtil1 class.
 */
class TestStaticUtil1 {
    public static void main(String[] args) {
        System.out.println(StaticUtil1.getA());
//        StaticUtil1.a;  doesn't compile
        StaticUtil1.setA(20);
        System.out.println(StaticUtil1.getA());
    }
}
