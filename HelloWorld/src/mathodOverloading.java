import java.util.Arrays;

public class mathodOverloading {

    public static void main(String[] args) {

//      Depending on the type of parameter compiler will call the required method.
//      Function Overloading -> Done during "COMPILE TIME" -> during compile they decide which method to run.

        fun(10);
        fun("Nihad");

        fun(20);
        fun("Halo");

//        fun(); // "Ambiguity" -> here we have two methods with variable argument so not sure which to call
//      If there was only one with method with variable argument then it would have called that
    }

//  Method Overloading -> More than one method with the same name but the number of arguments or
//  the type arguments will be different.
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String str){
        System.out.println(str);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
