public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 0;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
//            int mid = (start+end)/2 -> it can throw error when the value of (start+end) exceeds the INT_MAX value
            int mid = start + (end-start) / 2;
            if(arr[mid] == target)
                return mid;
            if(target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }

        return -1;
    }
}
