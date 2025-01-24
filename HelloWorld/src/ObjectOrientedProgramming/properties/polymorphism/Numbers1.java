package ObjectOrientedProgramming.properties.polymorphism;

// STATIC POLYMORPHISM
public class Numbers1 {

    void print(int a,int b){

    }

    void print(double a,int b){

    }

    public static void main(String[] args) {
        Numbers1 numbers1 = new Numbers1();
        numbers1.print(1,2);
        numbers1.print(2.0,1);
    }
}
