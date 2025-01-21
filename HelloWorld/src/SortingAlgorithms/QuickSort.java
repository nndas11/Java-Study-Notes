package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
//    TC: O(nlog(n)).
//    Not Stable Algorithm.
//    In-Place Sorting Algorithm.
//    Merge Sort is better for Linked List due to memory allocation -> non continous.
//    Quick Sort is better for arrays -> if array is already sorted then it will not swap. But in merge sort they will swap.


//    low and high is used for which portion of array we are dealing with.
//    start and end is used for swapping elements -> initially will be equal to start and end.
    static void quickSort(int[] nums,int low,int hi){
        if(low >= hi)
            return;

        int s = low;
        int e = hi;
//        Choose pivot -> here we are using the middle element.
        int mid = s + (e - s)/2;
        int pivot = nums[mid];

//        Moving pivot to correct position by swapping elements.
        while(s <= e){
            while(nums[s] < pivot)
                s++;
            while(nums[e] > pivot)
                e--;

            if(s <= e){
//                swap
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

//        Now solve the left half and right half -> Using recursion.
//        when comes out of loop both l and h will be crossed.
        quickSort(nums,low,e);
        quickSort(nums,s,hi);

    }

    public static void main(String[] args) {
        int[] nums = {3,2,15,6};
        quickSort(nums,0,nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
