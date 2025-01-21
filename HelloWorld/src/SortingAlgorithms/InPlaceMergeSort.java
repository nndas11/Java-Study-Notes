package SortingAlgorithms;

import java.util.Arrays;

public class InPlaceMergeSort {

//    TC: O(n * long(n)).

    public static void main(String[] args) {
        int[] arr = new int[]{20, 1, 10, 24, 13};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int l = start;
        int r = mid + 1;
        int j = 0;

        while(l <= mid && r <= end){
            if(arr[l] < arr[r])
                temp[j++] = arr[l++];
            else
                temp[j++] = arr[r++];
        }

        while(l <= mid){
            temp[j++] = arr[l++];
        }

        while(r <= end){
            temp[j++] = arr[r++];
        }

        for(int k=0;k<temp.length;k++){
            arr[start  + k] = temp[k];
        }
    }
}
