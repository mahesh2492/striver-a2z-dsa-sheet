package binarysearch.oneDArray;

public class BinarySearch {

    public static int search(int[] nums, int target) {
      int low = 0, high = nums.length - 1;
       while(low <= high) {
           int mid = low + (high - low) / 2;

           if(nums[mid] == target) {
               return mid;
           } else if(target > nums[mid]) {
               low = mid + 1;
           } else {
               high = mid - 1;
           }
       }

      return -1;
    }

    public static void main(String[] args) {
      int[] arr = {-1,0,3,5,9,12};
      int[] arr2 = {-1,0,3,5,9,12};

      System.out.println("Index of target element: " + search(arr, 9));
      System.out.println("Index of target element: " + search(arr2, 0));
    }
}
