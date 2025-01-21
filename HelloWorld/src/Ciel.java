public class Ciel {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,20};
        int target = 4;
        System.out.println(fincCiell(arr,target));
    }

    static int fincCiell(int[] arr, int target){
        int ciel = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = start + (end-start)/2;
//            if(target <= arr[middle])
//                ciel = arr[middle];
            if(target > arr[middle])
                start = middle + 1;
            else {
                ciel = arr[middle];
                end = middle - 1;
            }
        }
        return ciel;
    }

    static int cieling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        if(target > arr[arr.length - 1]){
            return -1;
        }

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

        return start;
    }

    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        if(target < arr[0]){
            return -1;
        }

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

        return end;
    }
}
