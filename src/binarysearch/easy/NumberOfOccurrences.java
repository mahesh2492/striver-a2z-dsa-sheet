package binarysearch.easy;

public class NumberOfOccurrences {

    static int countFreq(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    static int countFreqOptimal(int[] arr, int target) {
        int first = search(arr, target, true);
        if(first == -1) {
            first = 0;
        }
        int last = search(arr, target, false);

        return (last - first + 1);
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while(low <= high) {
            int mid =  low + (high - low) / 2;
            if(target > arr[mid]) {
                low = mid + 1;
            } else if(target < arr[mid]) {
                high = mid - 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int []arr = {1, 1, 2, 2, 2, 2, 3};

        System.out.println("Number of Occurrences of target 2:  "+ countFreq(arr, 2));
        System.out.println("Number of Occurrences of target 4:  "+ countFreq(arr, 4));
        System.out.println("Number of Occurrences of target 12: "+ countFreq(arr, 12));

        System.out.println("Number of Occurrences of target 2:  "+ countFreqOptimal(arr, 2));
        System.out.println("Number of Occurrences of target 4:  "+ countFreqOptimal(arr, 4));
        System.out.println("Number of Occurrences of target 12: "+ countFreqOptimal(arr, 12));
    }
}
