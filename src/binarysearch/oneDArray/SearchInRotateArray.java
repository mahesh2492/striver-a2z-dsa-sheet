package binarysearch.oneDArray;

public class SearchInRotateArray {
    public static int search(int[] nums, int target) {
       int low = 0, high = nums.length - 1;

       while(low <= high) {
           int mid = low + (high - low) / 2;
           if(nums[mid] == target) {
               return mid;
           } else if(nums[low] <= nums[mid]) {
               if(nums[low] <= target && target <= nums[mid]) {
                   high = mid - 1;
               } else {
                   low = mid + 1;
               }
           } else {
              if(nums[mid] <= target && target <=  nums[high]) {
                  low = mid + 1;
              } else {
                  high = mid - 1;
              }
           }
       }

       return -1;
    }

    // Can have same values as well. arr3 = {1,0,1,1,1}
    public static boolean search2(int[] nums, int target) {
       int low = 0, high = nums.length - 1;

       while(low <= high) {
           int mid = low + (high - low) / 2;
           if(nums[mid] == target) {
               return true;
           } else if(nums[low] == nums[mid] && nums[mid] == nums[high]) { //shrink the search space
               low++;
               high--;
           } else if(nums[low] <= nums[mid]) {
               if(nums[low] <= target && target <= nums[mid]) {
                   high = mid - 1;
               } else {
                   low = mid + 1;
               }
           } else {
              if(nums[mid] <= target && target <=  nums[high]) {
                  low = mid + 1;
              } else {
                  high = mid - 1;
              }
           }
       }

       return false;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr2 = {2,5,6,0,0,1,2};
        int[] arr3 = {3, 1};

        System.out.println("is it available in Rotated Sorted Array ? "+ search(arr, 0));
        System.out.println("is it available in Rotated Sorted Array ? "+ search(arr, 3));
        System.out.println("is it available in Rotated Sorted Array ? "+ search(arr3, 0));

        System.out.println("is element Present ? " + search2(arr, 0));
        System.out.println("is element Present ? " + search2(arr2, 3));
        System.out.println("is element Present ? " + search2(arr3, 1));

    }
}
