package homework4;

public class Operators {

    //1. Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
    //a + b
    //a * b
    //a / b
    //a - b
    //a % b
    /**
     * @param x first value
     * @param y second value
     * @return summary of two int values
     */
    public static int sum(int x, int y){
        return x+y;
    }

    /**
     * @param x first value
     * @param y second value
     * @return multiplication of two int values
     */
    public static int mult(int x, int y){
        return x*y;
    }

    /**
     * @param x the dividend
     * @param y the divisor
     * @return division of two values
     */
    public static float div(float x, float y){
        return x/y;
    }

    /**
     * @param x first value
     * @param y second value
     * @return substraction of two int values
     */
    public static int sub(int x, int y){
        return x-y;
    }

    /**
     * @param x the dividend
     * @param y the divisor
     * @return the remainder of x divided by y
     */
    public static int mod(int x, int y){
        return x%y;
    }




    //2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
    //c + d
    //c * d
    //c / d
    //c - d
    //c % d

    /**
     * @param x first value
     * @param y second value
     * @return summary of two double values
     */
    public static double sum(double x, double y){
        return x+y;
    }

    /**
     * @param x first value
     * @param y second value
     * @return multiplication of two double values
     */
    public static double mult(double x, double y){
        return x*y;
    }

    /**
     * @param x the dividend
     * @param y the divisor
     * @return division of two values
     */
    public static double div(double x, double y){
        return x/y;
    }

    /**
     * @param x first value
     * @param y second value
     * @return substraction of two double values
     */
    public static double sub(double x, double y){
        return x-y;
    }

    /**
     * @param x the dividend
     * @param y the divisor
     * @return the remainder of x divided by y
     */
    public static double mod(double x, double y){
        return x%y;
    }

    //10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
    //Կարանք օգտվենք Գաուսի բանաձևից
    public static int sumNum(int num){
        float sum = (num*(num+1))/2;
        return (int) sum;

    }



    //13 Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
    //2 տարբերակ եմ տեսնում, մեկը բազմապատկումը իմպելեմենտացնելնա ցիկլով, մեկն էլ բաժանել 8-ի կամ 16-ի հակադարձի վրա։

    public static int multV1(int num1, int num2){
        int mult = 0;
        for(int i = 0; i < num2; i++){
            mult += num1;
        }
        return mult;
    }
    public static int multV2(float num1, float num2){
        float mult = num1 / (1/num2);
        return (int) mult;

    }


    public static void main(String[] args) {
        //1. Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
        //a + b
        //a * b
        //a / b
        //a - b
        //a % b
        int a = 8;
        int b = 6;
        System.out.println("First task");
        System.out.println(sum(a, b));
        System.out.println(mult(a, b));
        System.out.println(div(a, b));
        System.out.println(sub(a, b));
        System.out.println(mod(a, b));
        //???
        System.out.println(mod(-7, 3));
        //???


        //2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
        //c + d
        //c * d
        //c / d
        //c - d
        //c % d
        double c = 6.4;
        double d = 0.03;
        System.out.println("Second task");
        System.out.println(sum(c, d));
        System.out.println(mult(c, d));
        System.out.println(div(c, d));
        System.out.println(sub(c, d));
        System.out.println(mod(c, d));


        //3․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
        //int x = 2 * ((5 + 3) * 4 – 8);
        //int y = 2 * 5 + 3 * 4 - 8;

        System.out.println("Third task");
        int x = mult(2,sub(mult( sum(5,3), 4),8));
        System.out.println(x);
        int y = sub(sum(mult(2, 5), mult(3,4)), 8);
        System.out.println(y);



        //4. Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում  հետևյալը․
        //1)-e
        //2)-f
        //3)+e
        //4)-e +92
        //5)!n1
        //6)!(!n1)
        //7)e++
        //8)--f
        //9) int x = 3;
        //   int y = ++x * 5 / x-- + --x;
        //   System.out.println("x is " + x);
        //   System.out.println("y is " + y);

        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println("Fourth task");
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        x = 3;
        y = ++x * 5 / x-- + --x;
        // y = 4 * 5 / 4 + 2 = 7
        System.out.println("x is " + x);
        System.out.println("y is " + y);



        //5․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
        //int x = (int)1.0;
        //short y = (short)1921222;
        //System.out.print(2147483647+1);
        //long y = (x=3);
        //boolean a = false;
        //boolean b = (y = true);
        //System.out.println(x);



        System.out.println("Task 5");
        System.out.println("int x = (int)1.0 will show " + 1);
        System.out.println("short y = (short)1921222 will show " + 7);
        System.out.println("System.out.print(2147483647+1) will show " + -2147483648);
        System.out.println("long y = (x=3); will show 3");
        System.out.println("boolean a = false; boolean b = (y=true); System.out.println(x); will show  ????");



    //6․ Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
        //System.out.println(x < y);
        //System.out.println(x <= y);
        //System.out.println(x >= y);
        //System.out.println(x > y);

        System.out.println("Task 6");
        int m = 10;
        int n = 20;
        System.out.println(m < n);
        System.out.println(m <= n);
        System.out.println(m >= n);
        System.out.println(m > n);


        //7. Գտնե և ուղղել սխալը․
        //
        //  1)  float y = 2.1;
        //
        //  2)  byte x = 5;
        //       byte y = 10;
        //       byte z = x + y;
        //
        // 3)   short x = 10;
        //       short y = 3;
        //       short z = x * y;
        //
        //
        // 4)    long x = 10;
        //       int y = 5;
        //       y = y * x;
        System.out.println("Task 7");
        float k = 2.1f;
        byte p = 5;
        byte o = 10;
        int i = o + p;
        short s = 10;
        short t = 3;
        int j = s * t;
        long lk = 10;
        int kl = 5;
        kl = (int) (lk * kl);
        System.out.println(kl);


        //8․ Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով փոխել։
        System.out.println("Task 8");
        int num1 = 10;
        int num2 = 5;
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println(num1 + " " + num2);

        //9․ Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
        //հետ փոխենք սկզբնական վիճակի
        System.out.println("Task 9");
        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " " + num2);

        //10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
        System.out.println("Task 10");
        System.out.println(sumNum(100));


        //11Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
        //a & b
        //a ^ b
        //a | b
        //~a
        //true || (a < 4)
        //(b >= 6) || (++a <= 7);
        //(a<b)?a:b
        //b^b

        int z = 8;
        int r = 3;
        System.out.println("Task 11");
        System.out.println(z & r);
        System.out.println(z ^ r);
        System.out.println(z | r);
        System.out.println(~z);
        System.out.println(true || (z < 4));
        System.out.println((r >= 6) || (++z <= 7));
        System.out.println((z<r)? z : r);
        System.out.println(r ^ r);



        //12  Տպել console -ում  հետևյալը․
        // 10 << 2
        //-10 << 3
        //20 >> 2
        //15 >> 3

        System.out.println("Task 12");
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        //13 Տրված փոփոխականը բազմապատկեք 8-ով և 16-ով առանց օգտագործելու *-նշանը։
        System.out.println("Task 13");
        System.out.println(multV1(15, 8));
        System.out.println(multV2(42, 16));














    }

}
