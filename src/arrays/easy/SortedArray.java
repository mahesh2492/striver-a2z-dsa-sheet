package arrays.easy;

public class SortedArray {
    public static boolean check(int[] nums) {
        int maybeRotationPoint = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i + 1) % nums.length]) {
                maybeRotationPoint++;
            }
        }
        System.out.println("rotation " + maybeRotationPoint);
        return maybeRotationPoint <= 1;
    }

    public static void main(String[] args) {
        int []nums = {2, 1, 3, 4};
        //int []nums = {3, 4, 5, 1, 2};
        //int []nums = {5,5,6,6,6,9,1,2};
        System.out.println(check(nums));
    }
}
