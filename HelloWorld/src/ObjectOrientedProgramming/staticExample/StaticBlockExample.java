package ObjectOrientedProgramming.staticExample;

public class StaticBlockExample {
    static int a = 1;
    static  int b;

//    only called once, when class is loaded.
    static {
        System.out.println("Inside STATIC BLOCK!!!!");
        b = a * 10;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlockExample.b);
    }
}
