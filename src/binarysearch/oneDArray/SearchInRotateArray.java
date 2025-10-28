package binarysearch.oneDArray;

public class SearchInRotateArray {
    public static int search(int[] nums, int target) {
       int low = 0, high = nums.length - 1;

       while(low <= high) {
           int mid = low + (high - low) / 2;
           if(nums[mid] == target) {
               return mid;
           } else if(nums[high] < nums[mid]) {
               low = mid + 1;
           } else {
               high = mid - 1;
           }
       }

       return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println("is it available in Rotated Sorted Array ? "+ search(arr, 0));
        System.out.println("is it available in Rotated Sorted Array ? "+ search(arr, 3));
    }
}
