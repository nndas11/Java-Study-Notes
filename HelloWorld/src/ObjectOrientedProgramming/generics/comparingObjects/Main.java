package ObjectOrientedProgramming.generics.comparingObjects;

public class Main {


    public static void main(String[] args) {
            Student nihad = new Student(1,10.0f);
            Student raju = new Student(2,11.0f);

            if(nihad.compareTo(raju) < 0){
                System.out.println("RAJU MORE MARKS");
            }

    }
}
