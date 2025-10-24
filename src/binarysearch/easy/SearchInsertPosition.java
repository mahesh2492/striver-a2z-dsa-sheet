package binarysearch.easy;

public class SearchInsertPosition {
    static public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1, position = nums.length;
        if(nums[high] < target) {
            return position;
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] >= target) {
                position = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};

        System.out.println("Search Insert Position of 5 is " + searchInsert(arr, 5)); // 2
        System.out.println("Search Insert Position of 2 is " + searchInsert(arr, 2)); // 1
        System.out.println("Search Insert Position of 7 is " + searchInsert(arr, 7)); // 4
    }
}
