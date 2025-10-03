package arrays.easy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionOfSortedArray {

    public static ArrayList<Integer> unionArray(int[] nums1, int[] nums2) {
        Set<Integer> mergeArray = new LinkedHashSet<>();
        int i = 0, j = 0, x = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergeArray.add(nums1[i]);
                i++;
            } else {
                mergeArray.add(nums2[j]);
                j++;
            }
        }

        while (i < nums1.length) {
            mergeArray.add(nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            mergeArray.add(nums2[j]);
            j++;
        }

        return new ArrayList<>(mergeArray);
    }

    public static void main(String[] args) {
        int [] nums1 = {4, 5, 8, 8, 8, 11, 14, 15, 17, 20};
        int[] nums2 = {1, 4, 4, 7};

        ArrayList<Integer> unionArray = unionArray(nums1, nums2);
        System.out.print("Merged Array: ");
        for (int j : unionArray) {
            System.out.print(j + " ");
        }
    }
}
