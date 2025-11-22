package binarysearch.oneDArray;

public class MinimumInRotatedArray {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while(low <= high) {
            //System.out.println("Min " + min);
            int mid = low + (high - low) / 2;
            if(nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);
                low = mid + 1;
            } else {
                high = mid - 1;
                min = Math.min(min, nums[mid]);
            }
        }

        return min;
    }

    public static void main(String[] args) {
       int[] arr = {3, 4, 5, 1, 2};
       int[] arr2 = {4,5,6,7,0,1,2};
       int[] arr3 = {11,13,15,17};

        System.out.println("Min in Rotated Sorted Array: " + findMin(arr));
        System.out.println("Min in Rotated Sorted Array: " + findMin(arr2));
        System.out.println("Min in Rotated Sorted Array: " + findMin(arr3));
    }
}
