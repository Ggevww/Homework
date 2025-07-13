package Homework5;

public class StatementsUtil {
    public static void main(String[] args) {
        StatementsUtil obj = new StatementsUtil();
        //1
        System.out.println(obj.isNumberEven(45));
        //2
        System.out.println(obj.checkSign(-12));
        //3
        System.out.println(obj.checkRange(6));
        //4
        System.out.println(obj.isDiv35(70));
        //5
        System.out.println(obj.isSecondDig7(574));
        //6
        System.out.println(obj.isInCircle(3, 4));
        //7
        System.out.println(obj.biggestOf(5,4,12));
        //8
        System.out.println(obj.isYearLeap(2025));
        //11
        obj.printNums(200);
        //12
        obj.printFirstDigit(3464755);
        obj.printFirstDigitV2(89563755);
        //13
        obj.Task13();
        //14
        obj.square(7);
        //15
        obj.sumNumMult5(45);
        //16
        System.out.println(obj.multOfEven(12));
        //17
        //???
        //18
        System.out.println(obj.sumOfDigits(32355));

    }
    //1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.

    /**
     * this method checks whether a number is even
     * @param x
     * @return {@code true} if number is even, {@code false} otherwise
     */
    public boolean isNumberEven(int x){
        return x % 2 == 0;
    }

    //2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.

    /**
     * this methode checks sign of num
     * @param x
     * @return sign of num
     */
    public char checkSign(int x){
        if(x>0){
            return '+';
        }else if(x<0){
            return '-';
        }else{
            return '0';
        }
    }

    //3․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից, Կամ փոքր  20 ից և մեծ 15 ից ․

    /**
     * this method finds whether a number is in given ranges
     * @param x
     * @return which range number is in
     */
    public String checkRange(int x){
        if(x > 5 && x < 8){
            return "Number is in (5;8)";
        }else if(x > 15 && x < 20){
            return "Number is in (15;20)";
        }else {
            return "Number is out of given ranges";
        }
    }


    //4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.

    /**
     *  Checks if a number is divisible by 35.
     * @param x
     * @return {@code true} if the number is divisible by 35, {@code false} otherwise
     */
    public boolean isDiv35(int x){
        return x % 35 == 0;

    }

    //5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
    //Օրինակ։ 974 -> true, 846 -> false

    /**
     *  Checks if the second digit of a three-digit number is 7.
     *  <p>
     *  Both positive and negative three-digit numbers are supported.
     *  If the number does not have exactly three digits (i.e., absolute value is less than 100 or greater than 999),
     *  the method returns {@code false}.
     * @param x
     * @return {@code true} if the tens digit is 7; {@code false} otherwise
     */
    public boolean isSecondDig7(int x){
        if(x/100 < 10 && x/100 > -10 && x/100 != 0){
            x = x/10;
            x = x%10;
            return x==7;
        }else{
            return false;
        }
    }

    //6․ Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։

    /**
     * Checks if the point (x, y) is inside or on the boundary of the circle (0;5)
     * @param x coordinate
     * @param y coordinate
     * @return {@code true} if the point is inside or on the circle, {@code false} otherwise
     */
    public boolean isInCircle(int x, int y){
        return x*x+y*y <= 25;
    }

    //7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։

    /**
     * Returns the largest of three integers.
     * @param x
     * @param y
     * @param z
     * @return the largest number
     */
    public int biggestOf(int x, int y, int z){
       if(y>x){
           x = y;
       }
       if(z>x){
           x = z;
       }
       return x;
    }

    //8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։
    // (նահանջ է համարվում այն տարին որը բաժանվում է 4, բայց բացառություն է արվում այն տարիների համար,
    // որոնք 100-ի բաժանվող են։ Այդ տարիները նահանջ են միայն, եթե նաև բաժանվում են 400-ի։)

    /**
     * Determines whether the given year is a leap year.
     * @param x
     * @return {@code true} if the given year is leap and {@code false} otherwise
     */
    public boolean isYearLeap(int x){
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            return true;
        }else{
            return false;
        }
    }

    //11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը․

    /**
     * prints in console numbers from 1 to x
     * @param x
     */
    public void printNums(int x){
        for(int i = 1; i<=x; i++){
            System.out.println(i);
        }
    }

    //12․  Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը.

    //1 Առաջինը մտքովս սենց տարբերակ անցավ

    /**
     * Prints the first digit of int
     * @param x
     */
    public void printFirstDigit(int x){
        int index = x;
        for(int i = 1; i < index; i*=10){
            if(x > 10){
                x = (x - x%10)/10;
            }

        }
        System.out.println(x);

    }

    //2 Հետո մի քիչ հեշտացրի
    public void printFirstDigitV2(int x){
        while(x>10){
            x /= 10;
        }
        System.out.println(x);
    }

    //13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը․

    public void Task13(){
        int x = 1;
        int y = 0;
        while(x<5 && y < 10){
            System.out.println(x+y);
            x++;
            y++;
        }
    }

    //14. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։

    /**
     * prints square with side x
     * @param x
     */
    public void square(int x){
        for (int i = 0; i<x; i++){
            for(int j = 0; j<x; j++){
                System.out.print("*     ");
            }
            System.out.println("\n");
        }

    }


    //15․ Գրել method, որը console -ից ստանում է  N թիվը և հաշվում է [1-N] բոլոր 5 -ի բաժանվող թվերի գումարը։

    /**
     * Calculates and prints the sum of all multiples of 5 from 0 up to x (inclusive).
     * @param x
     */
    public void sumNumMult5(int x){
        while(x%5 != 0){
            x--;
        }
        System.out.println(x);
        int sum = 0;
        for (int j = 0; j<= x; j+=5){
            sum += j;
        }
        System.out.println(sum);

    }

    //16. Գրել method, որը հաշվում է [1-N]  բոլոր  երկնիշ զույգ թվերի արտադրյալը։

    /**
     * Calculates the product of all even numbers from 2 up to {@code x} (inclusive)
     * @param x
     * @return the product of all even numbers from 2 up to {@code x} (inclusive)
     */
    public long multOfEven(int x){
        long mult = 1;
        for (int i = 2; i<=x; i+=2){
            mult *= i;
        }
        return mult;
    }

    //17․ Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է
    // մեծագույն և փոքրագույն տարրերը և հաշվում նրանց թվաբանական միջինը։

    //????



    //18․ Գրել method, որը  ստանում է 5 - անիշ ամբողջ թիվ  և հաշվում  այդ թվի թվանշանների գումարը։


    public int sumOfDigits(int x){
        int sum = 0;
        while (x>0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }










}
