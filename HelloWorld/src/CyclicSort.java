import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
//        worst case -> (n-1) swaps + n -> 2n-1 -> O(n)
//        works when numbers are in the range 1 to N. -> always use CYCLIC SORT.
//        Also for consecutive numbers use CYCLIC SORT.
//        index = value - 1; -> this is the only IMP concept.

        int[] arr = {3,1,4,5,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int idx = 0;
        while (idx < arr.length){
            int correctIdx = arr[idx] - 1;
//            if(arr[idx] == arr[correctIdx])
            if(idx == correctIdx)
                idx++;
            else
                swap(arr,idx,correctIdx);
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
