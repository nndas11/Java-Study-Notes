package ObjectOrientedProgramming.staticExample;

public class Human {
    String name;
    int age;
    float salary;

    static long population;

    public Human(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
//      this keyword not used -> because this represents the instance, but static variables are not dependent on object.
        Human.population += 1;
    }



}
