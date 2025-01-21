package Recursion;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
//        printTriangle2(4,0);
        int[] arr = {3,2,4,1};
//        bubbleSort(arr, arr.length - 1, 0);
//        System.out.println(Arrays.toString(arr));

        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

     static void printTriangle(int r,int c){
        if(r == 0)
            return;
        if(c < r){
            System.out.print(" * ");
            printTriangle(r,c + 1);
        }else{
            System.out.println();
            printTriangle(r - 1,0);
        }
    }

    static void printTriangle2(int r,int c){
        if(r == 0)
            return;
        if(c < r){
            printTriangle2(r,c + 1);
            System.out.print(" * ");
        }else{
            printTriangle2(r - 1,0);
            System.out.println();
        }
    }

    static void bubbleSort(int[] arr,int r,int c){

        if(r == 0)
            return;

        if(c < r){
            if(arr[c] > arr[c + 1]){
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(arr,r,c+1);
        }else{
            bubbleSort(arr,r - 1,0);
        }

    }

    static void selectionSort(int[] arr,int r,int c,int max){

        if(r == 0)
            return;

//        This is the single pass of elements.
//        We try to find the max in the current pass.
//        Then swap it with the r - 1 value -> Max element will be at the last index.
        if(c < r){
            if(arr[c] > arr[max]){
                selectionSort(arr,r,c + 1,c);
            }else {
                selectionSort(arr,r,c + 1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selectionSort(arr,r - 1,0,0);
        }
    }
}
