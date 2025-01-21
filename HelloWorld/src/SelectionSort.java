import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
//      Time Complexity
//      Best Case -> O(n2)
//      Worst Case -> O(n2)
//      Unstable Algorithm.
//      It performs best on small lists
        int[] nums = {3,26,1,7};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }

    static int[] selectionSort(int[] nums){
        for(int i=0;i<nums.length;i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }
        return nums;
    }

    static int getMaxIndex(int[] nums,int start,int end){
        int max = start;
        for (int i=0;i<=end;i++){
            if(nums[i] > nums[max])
                max = i;
        }
        return max;
    }

    static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
