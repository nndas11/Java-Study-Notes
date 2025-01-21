import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the String:");
        String name = sc.nextLine();

        System.out.println("Input the target:");
        char target = sc.next().charAt(0);

//        String name = "Nihad";
//        char target = 'i';
        boolean ans = searchInString(name,target);
        System.out.println(ans);
    }

    static boolean search2(String str,char target){
        if(str.isEmpty())
            return false;

        for(char a:str.toCharArray()){
            if(a==target)
                return true;
        }
        return false;
    }

    static boolean searchInString(String str, char target){
        if(str.isEmpty())
            return false;

        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i))
                return true;
        }
        return false;
    }
}

