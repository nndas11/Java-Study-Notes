package ObjectOrientedProgramming.staticExample;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.population);

        Human nihad = new Human("Nihad",20,100000);
        System.out.println(Human.population);

        Human rahul = new Human("Rahul",18,19999);
        System.out.println(Human.population);

//        NOT POSSIBLE -> message() require an instance of class but static method main does not require instance of class to run.
//        message();


        fun();


//        HOW POSSIBLE? -> create an instance and call
        Main obj = new Main();
        obj.message();

    }

    static void fun(){
        System.out.println("Hi");
    }

    void message(){
        System.out.println("hallo");
        fun(); // POSSIBLE
    }
}
