package binarysearch.oneDArray;

public class UpperBound {
    static int upperBound(int[] arr, int target) {
         int ans = arr.length;
         if(arr[ans - 1] < target) {
             return ans;
         }

         for(int i = 0; i < arr.length; i++) {
             if(arr[i] > target) {
                 ans = i;
                 break;
             }
         }
         return ans;
    }

    static int upperBoundOptimal(int[] arr, int target) {
        int low = 0, high = arr.length - 1, ans = arr.length;

        if(arr[high] < target) {
            return ans;
        }

        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int []arr1 = {2, 3, 7, 10, 11, 11, 25};
        int []arr2 = {2, 3, 7, 10, 11, 11, 25};
        int []arr3 = {2, 3, 7, 10, 11, 11, 25};

        System.out.println("Upper bound: " + upperBound(arr1, 9)); //3
        System.out.println("Upper bound: " + upperBound(arr2, 11));
        System.out.println("Upper bound: " + upperBound(arr3, 100));

        System.out.println("Upper bound using BS: " + upperBoundOptimal(arr1, 9));
        System.out.println("Upper bound using BS: " + upperBoundOptimal(arr2, 11));
        System.out.println("Upper bound using BS: " + upperBoundOptimal(arr3, 100));
    }
}
