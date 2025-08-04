package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp, length = arr.length;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
