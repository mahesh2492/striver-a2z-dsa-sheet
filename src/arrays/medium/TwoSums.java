package arrays.medium;

import java.util.Arrays;

public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int[] arr2 = {3,2,4};
        int[] arr3 = {3,3};
        System.out.println(Arrays.toString(twoSum(arr1, 9)));
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        System.out.println(Arrays.toString(twoSum(arr3, 6)));
    }
}
