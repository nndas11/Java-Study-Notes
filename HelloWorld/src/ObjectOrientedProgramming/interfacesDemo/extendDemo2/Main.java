package ObjectOrientedProgramming.interfacesDemo.extendDemo2;

public class Main implements A, B {

    @Override
    public void fun() {
        System.out.println("FUN");
    }

//    @Override
//    public void greetings() {
//        System.out.println("GREETING");
//    }

    public static void main(String[] args) {
        A.greet();
    }
}
