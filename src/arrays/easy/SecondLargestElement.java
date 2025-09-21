package arrays.easy;

public class SecondLargestElement {
    public static int getSecondLargest(int[] arr) {
        int max = arr[0], second_max = -1;

        //10, 5, 10 -> 10

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        for (int j : arr) {
            if (j > second_max && j != max) {
                second_max = j;
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
