package ObjectOrientedProgramming.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =1;
        int b=0;

        try {
            int c = a/b;
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("ALWAYS RUN");
        }

    }
}
