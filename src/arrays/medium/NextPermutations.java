package arrays.medium;

public class NextPermutations {
    public static void nextPermutation(int[] nums) {
        int temp;

        //step 1 - find the breakpoint
        int index = -1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // step 2 - find the strictly greater than break point number

        if(index != -1)
            for(int i = nums.length - 1; i >= 0; i--) {
                if(nums[i] > nums[index]) {
                    temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
            }

        // step 3 - minimize tail end after break point

        int left = index + 1, right = nums.length - 1;

        while(left < right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 0};

        nextPermutation(arr);
        for(int el: arr){
            System.out.print(el + " ");
        }
    }
}

