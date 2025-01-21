package ObjectOrientedProgramming.intro;

public class WrapperClass {
    public static void main(String[] args) {

        int a = 10;

        Integer num = 10;
        Demo d = new Demo("ll");

//        final keyword similar to const in other language.
        final int b = 10;
//        b = 20; -> NOT POSSIBLE

        final Demo demo = new Demo("HALO");
        demo.name = "Nihad"; // POSSIBLE -> as only changing value and demo is object not primitive.
//        demo = new Demo("asd"); -> NOT POSSIBLE -> cannot reassign a final non-primitive to another object.
        System.out.println(demo);
    }
}


class Demo{
    String name;

    public Demo(String name) {
        this.name = name;
    }

//    This method will be called whenever an object of this class is freed from memory by the garbage collector.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is getting destroyed");
    }
}