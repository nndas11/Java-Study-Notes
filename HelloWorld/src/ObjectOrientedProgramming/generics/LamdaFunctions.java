package ObjectOrientedProgramming.generics;

import java.util.ArrayList;

public class LamdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i + 1);
        }

        list.forEach((item) ->  System.out.println(item+2));

        Operation sum = (a,b) -> a+b;
        Operation multiply = (a,b) -> a*b;
        Operation diff = (a,b) -> a-b;

        LamdaFunctions f = new LamdaFunctions();
        System.out.println(f.operate(2,3,sum));

    }

    int sum(int a,int b){
        return a+ b;
    }

    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a,int b);
}
