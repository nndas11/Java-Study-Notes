import java.lang.reflect.Array;
import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        print(1,2,3,4);
        print(); // we can also pass 0 arguments. It works.
    }

    static void multiple(int a,int b, String ...v){ // Variable argument must be the last parameter.

    }

    static void print(int ...v){  // it internally takes it as an array of arguments.
        System.out.println(Arrays.toString(v));
    }
}
