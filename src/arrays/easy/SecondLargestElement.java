package arrays.easy;

public class SecondLargestElement {
    public static int getSecondLargest(int[] arr) {
        int max = arr[0], second_max = -1;

        //10, 5, 10 -> 10

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        int []nums = {12, 35, 1, 10, 34, 1};
        int max = getSecondLargest(nums);
        System.out.println("2nd Largest element: " + max);
    }
}
