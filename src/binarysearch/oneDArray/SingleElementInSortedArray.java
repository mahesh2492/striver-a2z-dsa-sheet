package binarysearch.oneDArray;

/*
https://leetcode.com/problems/single-element-in-a-sorted-array/description/
 */
public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
       int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println("Single Element: " +  singleNonDuplicate(arr));
    }
}
