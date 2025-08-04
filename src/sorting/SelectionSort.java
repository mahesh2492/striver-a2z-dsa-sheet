package sorting;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int temp, min;
        for(int i = 0; i < arr.length - 1; i++) {
            min = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int []arr = {4, 1, 3, 9, 7};
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
