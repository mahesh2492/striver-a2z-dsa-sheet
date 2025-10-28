package binarysearch.oneDArray;

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

    public static int findCeilUsingBS(int[] arr, int target) {
        int ans = arr.length;
        int low = 0, high = ans - 1;
        if(arr[ans - 1] < target) {
            return -1;
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};

        System.out.println("Ceiling in Sorted Array: " + findCeil(arr, 5));
        System.out.println("Ceiling in Sorted Array: " + findCeil(arr, 20));
        System.out.println("Ceiling in Sorted Array: " + findCeil(arr, 0));

        System.out.println("Ceiling in Sorted Array: " + findCeilUsingBS(arr, 5));
        System.out.println("Ceiling in Sorted Array: " + findCeilUsingBS(arr, 20));
        System.out.println("Ceiling in Sorted Array: " + findCeilUsingBS(arr, 0));
    }
}
