package binarysearch.oneDArray;

public class LowerBound {
    // using linear search
    static int lowerBound(int[] arr, int target) {
       int lowerBound = 0;
       if(target > arr[arr.length - 1]) {
           return arr.length;
       }
       for(int i = 0; i < arr.length; i++) {
           if(arr[i] >= target) {
               lowerBound = i;
               break;
           }
       }
       return lowerBound;
    }

    static int lowerBoundOptimal(int[] arr, int target) {
        int low = 0, high = arr.length - 1, lowerBound;
        lowerBound = arr.length;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] >= target) {
                lowerBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return lowerBound;
    }

    public static void main(String[] args) {
        int []arr1 = {2, 3, 7, 10, 11, 11, 25};
        int []arr2 = {2, 3, 7, 10, 11, 11, 25};
        int []arr3 = {2, 3, 7, 10, 11, 11, 25};

        System.out.println("Lower bound: " + lowerBound(arr1, 9));
        System.out.println("Lower bound: " + lowerBound(arr2, 11));
        System.out.println("Lower bound: " + lowerBound(arr3, 100));

        System.out.println("Lower bound using BS: " + lowerBoundOptimal(arr1, 9));
        System.out.println("Lower bound using BS: " + lowerBoundOptimal(arr2, 11));
        System.out.println("Lower bound using BS: " + lowerBoundOptimal(arr3, 100));
    }
}
