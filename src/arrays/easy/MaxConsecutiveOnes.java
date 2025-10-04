package arrays.easy;

public class MaxConsecutiveOnes {

    /*
        https://leetcode.com/problems/max-consecutive-ones/
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0, currentCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxConsecutiveOnes;
    }

    public static void main(String[] args) {
          int[] arr = {1,1,0,1,1,1};
        System.out.println("Max Consecutive ones: " + findMaxConsecutiveOnes(arr));
    }
}
