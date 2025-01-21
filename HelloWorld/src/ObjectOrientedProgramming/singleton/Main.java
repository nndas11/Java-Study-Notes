package ObjectOrientedProgramming.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance(10);
        Singleton obj2 = Singleton.getInstance(20);

        System.out.println(obj1.a);
        System.out.println(obj2.a);


    }
}
