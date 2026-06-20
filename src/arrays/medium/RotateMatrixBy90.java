package arrays.medium;

public class RotateMatrixBy90 {

    public static void rotate(int[][] matrix) {

        int temp;

        /*
            0, 0, -> 0, 0
            0, 1, -> 1, 0
            0, 2 -> 2, 0

            1, 0 -> 0, 1
            1, 1 -> 1, 1
            1, 2 -> 2, 1

         */
        // transpose the matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[0].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse every row
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
