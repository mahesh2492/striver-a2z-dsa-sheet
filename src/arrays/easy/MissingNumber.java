package arrays.easy;

/*
 https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int  expectedSum = 0, givenSum = 0;
        for(int i = 0; i < nums.length; i++) {
            expectedSum += i + 1;
            givenSum += nums[i];
        }
        return (expectedSum - givenSum);
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println("Missing number: " + missingNumber(arr));
    }
}
