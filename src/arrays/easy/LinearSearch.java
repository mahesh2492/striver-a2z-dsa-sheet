package arrays.easy;

public class LinearSearch {
    public static int search(int[] nums, int x) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int found = search(arr, 3);

        if(found == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Yay! Found the element.");
        }
    }
}
