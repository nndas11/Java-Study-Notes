package ObjectOrientedProgramming.intro;

public class Class {
    public static void main(String[] args){


//        Objects default value is NULL.
        class  Student {
            String name;
            int rollNo;
            float mark;

//            "this" keyword we can call another constructor from one constructor.
            Student(){
                this("Default",1,100.0f);
            }

            Student(String name,int rollNo,float mark){
                this.name = name;
                this.rollNo = rollNo;
                this.mark = mark;
            }

            Student(Student otherStd){
                this.name = otherStd.name;
                this.rollNo = otherStd.rollNo;
                this.mark = otherStd.mark;

            }

            void greetings(){
                System.out.println("My name is "+this.name);
            }
        }

        Student nihad = new Student("NIHAD",12,1.2f);
        Student demo = new Student(nihad);
        Student random = new Student();

        Student one = new Student();
        Student two = one;
        two.name = "Nihad";
        System.out.println(one.name);
        System.out.println(two.name);

        System.out.println(random.name);
        System.out.println(nihad.mark);
        System.out.println(demo.name);

        nihad.greetings();
    }
}


//
