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

    /*
       Better approach - Moore voting algo
     */

    public static int majorityElementOptimal(int[] nums) {
       int count = 1, majorityElement = nums[0];
        for(int i = 1; i < nums.length; i++) {
           if(count == 0) {
               count = 1;
               majorityElement = nums[i];
           } else if(nums[i] == majorityElement) {
               count++;
           } else {
               count--;
           }
       }

        count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == majorityElement) {
                count++;
            }
        }

        if(count > nums.length / 2) {
            return majorityElement;
        }

        return -1;
    }


        public static void main(String[] args) {
       int[] arr = {6, 5, 5};
       //int[] arr = {1};
       /*
           1 -> 3
           2 -> 4
           size - 7
           n/2 ->
        */

        System.out.println("Majority element: " + majorityElement(arr));
        System.out.println("Majority element: " + majorityElementOptimal(arr));
    }
}
