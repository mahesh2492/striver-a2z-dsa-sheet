package sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
          if(low < high) {
             int partitionIndex = partition(arr, low, high);
             quickSort(arr, low, partitionIndex - 1);
             quickSort(arr, partitionIndex + 1, high);
          }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low], i, j, temp;

        i = low;
        j = high;

        while(i < j) {
            while(arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low) {
                j--;
            }
            if(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int []arr = {4, 1, 3, 9, 7};
        quickSort(arr, 0, arr.length - 1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
