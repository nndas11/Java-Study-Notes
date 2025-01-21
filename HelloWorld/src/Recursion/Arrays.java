package Recursion;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
//        System.out.println(linearSearch(new int[]{1,2,100,4},100,0));
//        ArrayList<Integer> ans = new ArrayList<>();
//        linearSearchFindAllIndex(new int[]{1,2,2,3,4},2,0,ans);
        System.out.println(rotatedBinarySearch(new int[]{5,1,2,3,4},3,0,4));

    }

    static boolean sorted(int[] nums){
        return sortedHelper(nums,0);
    }

    static boolean sortedHelper(int[] nums,int index){
        if(index == nums.length - 1)
            return true;
        return nums[index] < nums[index + 1] && sortedHelper(nums,index + 1);
    }

    static boolean linearSearch(int[] nums,int target, int index){
        if(index == nums.length - 1)
            return false;

        return nums[index] == target || linearSearch(nums,target,index + 1);
    }

    static int linearSearchIndex(int[] nums,int target, int index){
        if(index == nums.length - 1)
            return -1;

        if(target == nums[index])
            return index;

        return linearSearchIndex(nums,target,index + 1);
    }

    static void linearSearchFindAllIndex(int[] nums, int target, int index, ArrayList<Integer> ans){
        if(index == nums.length - 1)
            return;

        if(target == nums[index])
            ans.add(index);

        linearSearchFindAllIndex(nums,target,index + 1,ans);
    }

    static ArrayList<Integer> findAllIndex(int[] nums, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == nums.length - 1)
            return list;

//        This will contain answer for that specific function call only.
        if(target == nums[index])
            list.add(index);

        ArrayList<Integer> answerFromBelowCalls = findAllIndex(nums,target,index + 1);
//        This code is only getting executed when stack is getting empty -> that is after it hits the base condition and going up on the tree.
        list.addAll(answerFromBelowCalls);
        return list;
    }

    static int rotatedBinarySearch(int[] arr,int target,int start,int end){
        if(start > end)
            return -1;

        int mid = start + (end - start)/2;
        if(arr[mid] == target)
            return mid;

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid])
                return rotatedBinarySearch(arr,target,start,end - 1);
            else
                return rotatedBinarySearch(arr,target,mid + 1,end);
        }
        if(target >= arr[mid] && target <= arr[end])
            return rotatedBinarySearch(arr,target,mid + 1,end);
        return rotatedBinarySearch(arr,target,start,mid - 1);


    }
}
