package ObjectOrientedProgramming.properties.polymorphism;

// STATIC POLYMORPHISM
public class Numbers {

    void print(int a,int b){

    }

    void print(double a,int b){

    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.print(1,2);
        numbers.print(2.0,1);
    }
}
