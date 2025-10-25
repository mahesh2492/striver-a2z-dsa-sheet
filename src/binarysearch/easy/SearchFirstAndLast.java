package binarysearch.easy;

import java.util.Arrays;

public class SearchFirstAndLast {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(first == -1) {
                    first = i;
                    last = i;
                } else {
                    last = i;
                }
            }
        }

        return new int[]{first, last};
    }

    public static int[] searchRangeUsingBS(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                ans = mid;
                if(findStartIndex) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] arr2 = {1};
        System.out.println("First and Last index of 8: " + Arrays.toString(searchRange(arr, 8)));
        System.out.println("First and Last index of 6: " + Arrays.toString(searchRange(arr, 6)));
        System.out.println("First and Last index of 0: " + Arrays.toString(searchRange(arr, 0)));
        System.out.println("First and Last index of 1: " + Arrays.toString(searchRange(arr2, 1)));

        System.out.println("First and Last index of 8: " + Arrays.toString(searchRangeUsingBS(arr, 8)));
        System.out.println("First and Last index of 6: " + Arrays.toString(searchRangeUsingBS(arr, 6)));
        System.out.println("First and Last index of 0: " + Arrays.toString(searchRangeUsingBS(arr, 0)));
        System.out.println("First and Last index of 1: " + Arrays.toString(searchRangeUsingBS(arr2, 1)));
    }
}
