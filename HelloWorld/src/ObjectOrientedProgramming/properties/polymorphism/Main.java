package ObjectOrientedProgramming.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        Shapes s1 = new Square();

        Shapes triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();

        s1.area();
    }
}
