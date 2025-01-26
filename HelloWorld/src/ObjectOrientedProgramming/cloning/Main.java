package ObjectOrientedProgramming.cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human nihad = new Human(21,"Nihad");
//        Human twin = new Human(nihad);

        Human twin = (Human) nihad.clone();
        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(nihad.arr));
    }
}
