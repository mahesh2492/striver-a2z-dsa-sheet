package arrays.medium;

import java.util.HashMap;

/*
   https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int size = nums.length, value = 1;
        HashMap<Integer, Integer> frequencyOfElements = new HashMap<>();
        for(int i = 0; i < size; i++) {
            int key = nums[i];
            if(frequencyOfElements.containsKey(key)) {
                value = frequencyOfElements.get(key) + 1;
                frequencyOfElements.replace(key, value);
            } else {
                frequencyOfElements.put(key, 1);
            }

            if(value > size / 2) {
                return nums[i];
            }
        }


        return value;
    }

    public static void main(String[] args) {
       //int[] arr = {2,2,1,1,1,2,2};
       int[] arr = {1};
       /*
           1 -> 3
           2 -> 4
           size - 7
           n/2 ->
        */

        System.out.println("Majority element: " + majorityElement(arr));
    }
}
