package homework15;

import java.util.function.Supplier;

public class FunctionalProg {
    static void print(Test obj){
        obj.test();
    }
    static  void suptest(Supplier<?> A ) {

    }

    static void main() {
        print(()->{
            System.out.println("Hello world!");
        });

        print(()->{
            System.out.println("Hello Friend!");
        });
        print(()->{
            System.out.println("Now i'm trying to do some real tests");
            System.out.println(2+6);
            int a =20;
            int b = 30;
            System.out.println(a+b);

        });


    }
}
