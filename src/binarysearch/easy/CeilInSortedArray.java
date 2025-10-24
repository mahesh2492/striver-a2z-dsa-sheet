package binarysearch.easy;

public class CeilInSortedArray {

    public static int findCeil(int[] arr, int target) {
        int ans = arr.length;
        if(arr[ans - 1] < target) {
            return -1;
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > target) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};

        System.out.println("Ceiling in Sorted Array: " + findCeil(arr, 5));
        System.out.println("Ceiling in Sorted Array: " + findCeil(arr, 20));
        System.out.println("Ceiling in Sorted Array: " + findCeil(arr, 0));
    }
}
