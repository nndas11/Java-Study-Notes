package ObjectOrientedProgramming.enumExamples;

public class Main {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

//        static, public and final
//        since its final you cannot create child enums


        Week() {

        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
    }
}
