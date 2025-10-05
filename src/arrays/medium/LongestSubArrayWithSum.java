package arrays.medium;

import java.util.*;

/*
   https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
 */
public class LongestSubArrayWithSum {

    public static int longestSubarray(int[] arr, int k) {
        ArrayList<Integer> subArrays = new ArrayList<>();
        subArrays.add(0);
        for(int i = 0; i < arr.length; i++) {
            int currentLongestLength = 0;
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum += arr[j];
                currentLongestLength++;
                if(sum == k) {
                    subArrays.add(currentLongestLength);
                }
            }
        }

        return Collections.max(subArrays);
    }

    public static int longestSubarrayOptimal(int[] arr, int k) {
        int left = 0, right = 0, len = arr.length;
        int sum = arr[0];
        int maxLen = 0;
        while (right < len) {
            while(left <= right && sum > k) {
                sum = sum - arr[left];
                left++;
            }

            if(sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < len)
                sum += arr[right];
        }
      return maxLen;
    }

    /*
        Using extra space
     */
    public static int longestSubarrayOptimal2(int[] arr, int k) {
        int sum = 0, maxLength = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            if(!prefixSums.containsKey(sum)) {
              prefixSums.put(sum, i);
            }
            if(prefixSums.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSums.get(sum - k));
            }
        }
        return maxLength;
    }


    /*
       Input: nums = [10, 5, 2, 7, 1, 9],  k=15
       Output: 4
     */
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, -10};
        //int[] arr = {-5, 8, -14, 2, 4, 12};
        System.out.println("\nLongest length of subarray: " + longestSubarray(arr, 15));
        System.out.println("\nLongest length of subarray: " + longestSubarrayOptimal(arr, 15));
        System.out.println("\nLongest length of subarray: " + longestSubarrayOptimal2(arr, 15));
    }
}
