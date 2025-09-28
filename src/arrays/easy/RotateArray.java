package arrays.easy;

import static java.lang.Math.abs;

public class RotateArray {

    // 1, 2, 3, 4, 5, 6, 7 -> 7, 1, 2, 3, 4, 5, 6
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        for(int i = start, j = end; i <= j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
         int []arr = {1, 2, 3, 4, 5, 6, 7};
         rotate(arr, 3);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
