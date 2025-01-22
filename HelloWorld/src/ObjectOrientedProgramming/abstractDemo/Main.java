package ObjectOrientedProgramming.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(24);
        son.career("coder");

        Parent.print();

//        Parent p = new Parent() ; -> NOT POSSIBLE

        Parent son1 = new Son(20);
        son1.career("doctor");

    }
}
