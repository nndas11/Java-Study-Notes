public class findElementInSortedInfiniteArray {
    public static void main(String[] args) {
//      We Ignore the IndexOutOfBounds Error and also integer overflow error.
//      As interviewer is looking at your LOGIC only.
//      Array Sorted -> So Must be BINARY SEARCH.
//      We don't use arr.length -> as the array is infinite.
//      But the problem arise we don't know the start and end for the binary search.
//
//          SOLUTION : WE MOVE IN CHUNK SIZES. -> INCREASE THE CHUNK
//        In this approach we are actually finding the doubling the chunk size -> so in a way we are reversing Binary Search. So TC will be same.
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 4;
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newStart = end + 1;
            end = end + (end - start + 1) *2;
            start = newStart;
        }
        System.out.println(binarySearch(arr,start,end,target));
    }

    static int binarySearch(int[] arr,int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid])
                start = mid + 1;
            else if(target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}

// 1 4 10 2

// 1 4 15 3

// 1 10 7 6 2