package ObjectOrientedProgramming.abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }
    @Override
    void career(String name) {
        System.out.println(name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println(name + " " + age);
    }
}
