package arrays.easy;

public class LargestElement {

    public static int largest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums = {1, 8, 7, 56, 90};
        int max = largest(nums);
        System.out.println("Largest element: " + max);
    }
}
