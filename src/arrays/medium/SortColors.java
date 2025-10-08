package arrays.medium;

/*
https://leetcode.com/problems/sort-colors/submissions/1794865339/

Better approach - Dutch National Flag algorithm
 */
public class SortColors {
    public static void sortColors(int[] nums) { // used idea of insertion sort
        for(int i = 0; i < nums.length; i++) {
         int minIndex = i;
         for(int j = i + 1; j < nums.length; j++) {
             if(nums[j] < nums[minIndex]) {
                 minIndex = j;
             }
         }

         int temp = nums[i];
         nums[i] = nums[minIndex];
         nums[minIndex] = temp;
       }
    }

    public static void sortColorUsingNationalFlagDutchAlgo(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high) {
           if(nums[mid] == 0) {
               swap(nums, low, mid);
               low++;
               mid++;
           } else if(mid == 1) {
               mid++;
           } else {
               swap(nums, mid, high);
               high--;
           }
        }
    }

    public static void swap(int[] nums, int i, int j) {
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j] = temp;
    }

    public static void main(String[] args) {
        int []arr = {2,0,2,1,1,0};
        sortColors(arr);
        sortColorUsingNationalFlagDutchAlgo(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
