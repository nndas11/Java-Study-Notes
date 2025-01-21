package ObjectOrientedProgramming.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new BoxWeight(1,2,3,4);
        System.out.println(box1.w);

//        NOT POSSIBLE -> we can access the variables of the reference type but here the BOX object does not return weight variable to refer so this way is not possible.
//        BoxWeight box2 = new Box(1,2,3);
    }
}
