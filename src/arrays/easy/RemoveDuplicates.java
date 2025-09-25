package arrays.easy;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int lastElement = nums[0];
        ArrayList<Integer> list = new ArrayList<>();

        list.add(lastElement);
        for(int i = 1; i < length; i++) {
            if (nums[i] != lastElement) {
                lastElement = nums[i];
                list.add(lastElement);
            }
        }

        for(int i = 0 ; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
     }

     public static int removeDuplicatesOptimal(int[] nums) {
        int length = nums.length, left;
         left = 0;

        for(int i = 1; i < length; i++) {
            if (nums[i] != nums[left]) {
                nums[left + 1] = nums[i];
                left++;
            }
        }

        return left + 1;
     }

    public static void main(String[] args) {
        //int []arr = {1, 1, 2};
        int []arr = {1,1, 2, 2, 3};
        int k = removeDuplicates(arr);
        int s = removeDuplicatesOptimal(arr);
        System.out.println("Unique keys - " + k);
        System.out.println("Unique keys via optimal solution - " + s);
    }
}
