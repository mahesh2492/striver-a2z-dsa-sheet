package arrays.medium;

import java.util.ArrayList;
import java.util.Stack;

public class LeaderArray {

    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leader = new ArrayList<>();

        Stack<Integer> leaderStack = new Stack<>();

        int len = arr.length - 1, max;
        leaderStack.push(arr[len]);
        max = arr[len];
        len--;

        //arr = [16, 17, 4, 3, 5, 2]
        while(len >= 0) {
            if(arr[len] >= arr[len + 1] && arr[len] >= max) {
                leaderStack.push(arr[len]);
                max = Math.max(arr[len], max);
            }
            len--;
        }

        while(!leaderStack.isEmpty()) {
            int element = leaderStack.peek();
            leaderStack.pop();
            leader.add(element);
        }

        return leader;

    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 1, 2};

        ArrayList<Integer> result =  leaders(arr);
        for(int el: result){
            System.out.print(el + " ");
        }
    }
}
