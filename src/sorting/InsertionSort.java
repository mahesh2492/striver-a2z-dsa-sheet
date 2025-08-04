package sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int temp, j;
        for(int i = 0; i < arr.length; i++) {
            j = i;
            while(j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {4, 1, 3, 9, 7};
        insertionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
