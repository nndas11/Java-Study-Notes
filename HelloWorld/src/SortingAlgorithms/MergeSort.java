package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20,1,10,24,13};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr){
        if(arr.length == 1)
            return arr;

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right =  mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first,int[] second){
        int[] ans = new int[first.length + second.length];
        int i = 0;
        int l = 0;
        int r = 0;
        while(l < first.length && r < second.length){
            if(first[l] < second[r])
                ans[i++] = first[l++];
            else
                ans[i++] = second[r++];

        }

        while(l < first.length){
            ans[i++] = first[l++];
        }

        while(r < second.length){
            ans[i++] = second[r++];
        }

        return ans;
    }

}
