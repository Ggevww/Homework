package homework1;

 class Variables{

    // 1
    static byte a = -127;
    static byte b = 126;

    /**
     * this method prints two byte values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printByte(byte x, byte y){
        System.out.println(x + ", " + y);

    }

    //2
    static short c = 128;
    static short d = 1024;

    /**
     * this method prints two short values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printShort(short x, short y){
        System.out.println(x + ", " + y);

    }

    //3
    static int e = 600000;
    static int f = -800000;

    /**
     * this method prints two int values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printInt(int x, int y){
        System.out.println(x + ", " + y);

    }

    //4
    static long g = 600000000;
    static long h = -80000000;

    /**
     * this method prints two long values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printLong(long x, long y){
        System.out.println(x + ", " + y);

    }

    //5
    /**
     * This method prints to the console Max & Min values of each type in Integer group
     */
    public static void printMaxMin(){
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

    }


    //6
    static int binarNum1 = 0b10101010;
    static byte binarNum2 = 0b0101010;

    /**
     * this method prints one int and one byte value to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printFromBin(int x, byte y){
        System.out.println(x + ", " + y);

    }

    //7
    static float j = 45.7689f;
    static float k = -1856.9f;

    /**
     * this method prints two float values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printFloat(float x, float y){
        System.out.println(x + ", " + y);
    }


    //8
    static double l = 1.7976931348623157E308;
    static double m = 3.141592653589793;

    /**
     * this method prints two double values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printDouble(double x, double y){
        System.out.println(x + ", " + y);
    }


    //9
    /**
     * This method prints to the console Max & Min values of float and double
     */
    public static void printMaxMinFD(){
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

    }


    //10
    /*
    In fact, all of these numbers can be declared as double, but some of them are also suitable
    for float. 34.567839023 and 8923.1234857 require double for accurate representation, while 12.345 and 3456.091
    can be stored as float.
     */



    //11
    static char n = 'k';
    static char o = 64;

    /**
     * this method prints two char values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printChar(char x, char y){
        System.out.println(x + ", " + y);
    }


    //12.1
    static char s = 77;
    static char w = 109;

    //12.2
    static char kByHexNum1 = 0x004B;
    static char kByHexNum2 = '\u004B';
    static char kByNum = 75;
    static char kBySymbol = 'K';


    //13
    static boolean tr = true;
    static boolean fal = false;

    /**
     * this method prints two boolean values to the console
     * @param x first value to print
     * @param y second value to print
     */
    public static void printBool(boolean x, boolean y){
        System.out.println(x + ", " + y);
    }

    //14
    /*
     int year = 201l;
     System.out.print (year);
    will show:
    java: incompatible types: possible lossy conversion from long to int

    This error appears because we want to assign a long value to an int variable.
    The letter l at the end of the number indicates that it is a long.Even if the value fits
    within the int range, adding l makes the number a long.
     */


    //JAVA TYPE CASTING


    //15
    static int aa = 7;

    /**
     * this method converts int value to long and prints it to the console
     * @param x int
     */
    public static void castIntToLong(int x){
        long bb = x;
        System.out.println(bb);
    }

    //16
    static int myInt = 7;

    /**
     * this method converts int value to double and prints it to the console
     * @param x int
     */
    public static void castIntToDouble(int x){
        double myDouble = x;
        System.out.println(myDouble);
    }

    //17
    static double dd = 9.78;


    /**
     * this method converts double value to int and prints it to the console
     * @param x double
     */
    public static void castDoubleToInt(double x){
        int ii = (int) x;
        System.out.println(ii);
    }

    //18
    static int ff = 9999;

    /**
     * this method converts int value to byte and prints it to the console
     * @param x int
     */
    public static void castIntToByte(int x){
        byte gg = (byte) x;
        System.out.println(gg);
    }



    public static void main(String[] args){
        //1
        printByte(a, b);
        //2
        printShort(c, d);
        //3
        printInt(e, f);
        //4
        printLong(g, h);
        //5
        printMaxMin();
        //6
        printFromBin(binarNum1, binarNum2);
        //7
        printFloat(j, k);
        //8
        printDouble(l, m);
        //9
        printMaxMinFD();
        //11
        printChar(n, o);
        //12.1
        printChar(s, w);
        //12.2
        printChar(kByHexNum1, kByHexNum2);
        printChar(kByNum, kBySymbol);
        //13
        printBool(tr, fal);
        //15
        castIntToLong(aa);
        //16
        castIntToDouble(myInt);
        //17
        castDoubleToInt(dd);
        //18
        castIntToByte(ff);
        //this code prints 15, because when we convert int to byte,
        //java keeps only last 8 bits of int value, in this case last 8 bits is 15

        //19
        long max = 3123456789L;
        double d = 1000.00;
        char i ='i';
        char j='j';
        char ij = (char) (i + j);
        int a7 = 8;
        long h = 0;
        h +=8;
        int n = 11;
        m = n;
        System.out.println(max + ", " + d + ", " + i + ", " + j + ", " + ij + ", " + a7 + ", " + h +", " + n + ", " + ", " + m);

    }

}