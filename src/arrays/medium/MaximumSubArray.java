package arrays.medium;

public class MaximumSubArray {

    public static int maxSubArray(int[] nums) {
        int sum = 0, max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
        }
      return max;
    }
    public static void printMaxSubArray(int[] nums) {
        int sum = 0, max = nums[0], ansStart = -1, ansEnd = -1, start = -1;
        for(int i = 0; i < nums.length; i++) {
            if(sum == 0) {
                start = i;
            }
            sum += nums[i];
            if(sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0) sum = 0;
        }

        while(ansStart < ansEnd) {
            System.out.print(nums[ansStart] + " ");
            ansStart++;
        }
    }

    public static void main(String[] args) {
       int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.print("\nMaxium SubArray: ");
        printMaxSubArray(arr);
        System.out.println("\nMaxium SubArray sum: " + maxSubArray(arr));
    }
}
