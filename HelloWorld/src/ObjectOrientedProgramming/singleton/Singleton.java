package ObjectOrientedProgramming.singleton;

public class Singleton {

    int a;
    private Singleton(int a) {
        this.a  = a;
    }

    private static Singleton instance;

    public static Singleton getInstance(int a){
        if (instance==null){
            instance =  new Singleton(a);
        }
        return  instance;
    }
}
