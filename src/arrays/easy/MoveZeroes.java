package arrays.easy;

import java.util.ArrayList;

public class MoveZeroes {
    // Using extra memory
    public static void moveZeroes(int[] nums) {
        int i, j = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(j < nums.length) {
              if(nums[j] != 0) {
                  arrayList.add(nums[j]);
              }
            j++;
        }
        for(i = 0; i < arrayList.size(); i++) {
            nums[i] = arrayList.get(i);
        }

        while(i < nums.length) {
            nums[i++] = 0;
        }

    }

    // Two pointer approach
    public static void moveZeroesOptimal(int[] nums) {
       int i, j;
       i = j = 0;
       while(i < nums.length) {
           if(nums[i] != 0) {
               int temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
               j++;
           }
           i++;
       }
    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroesOptimal(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
