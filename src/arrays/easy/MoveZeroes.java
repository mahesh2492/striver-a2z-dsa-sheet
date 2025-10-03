package arrays.easy;

import java.util.ArrayList;

public class MoveZeroes {
    // Using extra memory
    public static void moveZeroes(int[] nums) {
        int i, j = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

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

    public static void moveZeroesOptimal(int[] nums) {
       // Todo
    }


    public static void main(String[] args) {
        //int[] arr = {0,1,0,3,12};
        // i - 1
        //i - 0, 1
        int[] arr = {0};
        moveZeroes(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
