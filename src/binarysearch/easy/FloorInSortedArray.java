package binarysearch.easy;

public class FloorInSortedArray {
    public static int findFloor(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = -1;

        while(low <= high) {
            int mid  = low + (high - low) / 2 ;
            if(arr[mid] <= target) {
               ans = mid;
               low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};

        System.out.println("Ceiling in Sorted Array: " + findFloor(arr, 5));
        System.out.println("Ceiling in Sorted Array: " + findFloor(arr, 11));
        System.out.println("Ceiling in Sorted Array: " + findFloor(arr, 0));
    }
}
