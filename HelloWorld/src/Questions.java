import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(isPrime(n));
        System.out.println(isArmstrong(n));
    }

    static boolean isPrime(int n){
//        edge case
        if (n <= 1){
            return false;
        }
//        Method 1:
//        for(int i=2;i<n;i++){
//            if(n%i == 0){
//                return false;
//            }
//        }
//        return true;

//        Method 2:
        int i = 2;
        while(i*i <n){
            if (n%i == 0)
                return false;
            i++;
        }
        return i*i > n;
    }

    static boolean isArmstrong(int n){
        int orginal = n;
        int sum = 0;

        while (n >0){
            int rem = n%10;
            sum += rem * rem * rem;
            n = n/10;

        }

        return sum == orginal;
    }
}
