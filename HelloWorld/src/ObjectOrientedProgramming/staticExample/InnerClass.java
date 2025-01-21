package ObjectOrientedProgramming.staticExample;

 public class InnerClass {

     public static void main(String[] args) {
         Test demo = new Test(1);
         Test demo2 = new Test(2);

         System.out.println(demo.a);
         System.out.println(demo2.a);

         System.out.println(demo);
     }
     static class Test{
        int a;

         public Test(int a) {
             this.a = a;
         }

         @Override
         public String toString() {
             return "NIHAD";
         }
     }
}
