package arrays.medium;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int oddIndex = 1, evenIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ans[evenIndex] = nums[i];
                evenIndex = evenIndex + 2;
            } else {
                ans[oddIndex] = nums[i];
                oddIndex = oddIndex + 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};

        int[] result = rearrangeArray(arr);

        for(int elem: result) {
            System.out.print(elem + " ");
        }
    }
}

