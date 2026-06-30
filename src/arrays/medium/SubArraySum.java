package arrays.medium;
import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public static int subarraySum(int[] nums, int k) {
        int totalCount = 0, currentsum = 0;
        Map<Integer, Integer> prefixSum = new HashMap<>();

        prefixSum.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            currentsum += nums[i];

            if(prefixSum.containsKey(currentsum - k)) {
                totalCount += prefixSum.get(currentsum - k);
            }

            prefixSum.put(currentsum, prefixSum.getOrDefault(currentsum, 0) + 1);
        }

        return totalCount;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 2, -3, 1, 4, 2};
        int[] arr2 = {0, 0, 0, 0, 0};
        int[] arr3 = {-1, -1, -1};
        int[] arr4 = {1, 2, 3};
        System.out.println(subarraySum(arr, 7));
        System.out.println(subarraySum(arr2, 0));
        System.out.println(subarraySum(arr4, 0));
    }
}