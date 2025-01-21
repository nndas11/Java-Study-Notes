import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

//        Dynamic array in Java -> ArrayList
//        Equivalent to vectors in C++
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> array2d = new ArrayList<>();
        list.add(10);
        list.add(20);

//        list.size()
        list.set(0,12);

        for(Integer a: list){
            System.out.println(a);
        }

        System.out.println(list);
    }
}
