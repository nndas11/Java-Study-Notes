public class Shadowing {
    static int x = 90; // this will be shadowed in line 6.

    public static void main(String[] args) {

        System.out.println(x);
//        int x = 10; //scope overlaps -> so higher order scope variable will become hidden.
        int x; // shadowing happens from here -> from declaration of variable.

//        System.out.println(x); we cannot print as x has no value -> not intiliazed

        x = 10;
        System.out.println(x); // 10 will be printed
        demo();
    }

    static void demo(){
        System.out.println(x);
    }
}
