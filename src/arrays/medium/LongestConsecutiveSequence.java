package arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class LongestConsecutiveSequence {

    public static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high) {
            if(arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Time complexity - O(nLogN)
    public static int longestConsecutive(int[] nums) {
        int max = 1, currentMax = 1;
        int length = nums.length;
        if(length == 0) {
            return 0;
        }

        mergeSort(nums, 0, length - 1);

        for(int i = 1; i < length; i++) {
            if(nums[i] - nums[i - 1] > 1) {
                currentMax = 1;
            } else if(nums[i] - nums[i - 1] == 1) {
                currentMax++;
                max = Math.max(currentMax, max);
            }

        }
        return max;
    }

    // Time complexity - O(N)
    public static int longestConsecutiveV2(int[] nums) {
      int max = 1, currentMax = 0;

      if(nums.length == 0) {
          return 0;
      }

      Set<Integer> hs = new HashSet<>();

      for(int num: nums) {
          hs.add(num);
      }

      for(int elem: hs) {
          if(!hs.contains(elem - 1)) {
              currentMax = 1;

              int num = elem;
              while(hs.contains(num + 1)) {
                  currentMax++;
                  max = Math.max(max, currentMax);
                  num++;
              }
          }
      }


      return max;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1}; // 0,0,1,2,3,4,5,6,7,8
        System.out.println(longestConsecutive(arr));
        System.out.println(longestConsecutiveV2(arr));
    }

}

