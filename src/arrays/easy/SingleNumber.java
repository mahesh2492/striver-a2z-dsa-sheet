package arrays.easy;

/*
https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int missingNumber = nums[0];
        for(int i = 1; i < nums.length; i++) {
             missingNumber = missingNumber ^ nums[i];
         }
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println("Missing number: " + singleNumber(arr));
    }
}
