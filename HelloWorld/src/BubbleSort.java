import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        Also known as -> Sinking sort, Exchange sort.
//        Best Case -> O(n) -> Array is already sorted.
//        Worst Cast -> O(n2) -> Array is sorted in opposite order.
//        Stable Algorithm -> when the original order is maintained for the same values in the sorted array also then called Stable Algorithm.
//        Bubble Sort is a Stable Algorithm.
//        In-place sorting algorithm.
        int[] nums = {3,2,1,5};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }

    static int[] bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
//            In each pass , the last element get in the correct position.
            boolean swapped = false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
//            if no swap occurred in the current pass then the array is sorted so we can break.
            if(!swapped)
                break;
        }
        return nums;
    }
}
