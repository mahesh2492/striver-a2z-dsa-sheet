package arrays.easy;

import static java.lang.Math.abs;

public class RotateArray {

    // 1, 2, 3, 4, 5, 6, 7 -> 7, 1, 2, 3, 4, 5, 6
    public static int[] rotate(int[] nums, int k) {
        int []rotatedArray = new int[nums.length];
        int left = 0, right = abs(nums.length - k);
        System.out.println("index " + right);
        for(int i = right; i < nums.length; i++) {
          rotatedArray[left++] = nums[i];
        }

        for(int i = 0; i < nums.length - k; i++) {
            rotatedArray[left++] = nums[i];
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
         //int []arr = {1, 2, 3, 4, 5, 6, 7};
         int []arr = {1, 2};
         int []rotated_arr = rotate(arr, 7);
        for(int i = 0; i < rotated_arr.length; i++) {
            System.out.print(rotated_arr[i] + " ");
        }
    }
}
