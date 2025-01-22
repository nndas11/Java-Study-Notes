package ObjectOrientedProgramming.abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }

    static void print(){
        System.out.println("HI!");
    }

    void normal(){
        System.out.println("Normal Methods");
    }

    abstract void career(String name);
    abstract void partner(String name,int age);
}
