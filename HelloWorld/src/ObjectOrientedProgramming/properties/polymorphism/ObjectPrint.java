package ObjectOrientedProgramming.properties.polymorphism;

public class ObjectPrint {
    int a;

    public ObjectPrint(int a) {
        this.a = a;
    }

//    Overriding the DEFAULT toString() -> the DEFAULT toString() method is the method of the object class.
//    All classes in JAVA are inherited from the OBJECT class.
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "a=" + a +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(1);

//        BY DEFAULT -> It will call the toString() method. We can override this method.
        System.out.println(obj);
    }
}
