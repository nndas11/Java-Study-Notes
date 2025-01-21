import java.util.Scanner;

public class Functions {
    static int a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        a=10;
        System.out.println(sumOfTwoNumbers(firstNum,secondNum));
    }

    static int sumOfTwoNumbers(int a,int b){
        return a+b;
    }
}
