import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        Time Complexity
//        Best Case -> O(n) -> Array is already sorted.
//        Worst Case -> O(n2) -> Array is sorted in the reverse direction.
//        Why we use it? -> Ans ->
//        Adaptive -> steps is reduced when array is sorted. So less numbers of swaps than bubble sort.
//        Stable Algorithm.
//        Used for smaller values of n. Works good when array is partially sorted.

        int[] arr = {3,2,1,100,98};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j-1])
                    swap(arr,j,j-1);
                else
                    break;
            }
        }
    }

    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
