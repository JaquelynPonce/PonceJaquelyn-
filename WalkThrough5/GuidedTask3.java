public class MatrixMultiplication {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };
        
        // Ensure the number of columns of matrix1 equals the number of rows of matrix2
        if (matrix1[0].length == matrix2.length) {
            int[][] result = new int[matrix1.length][matrix2[0].length];
            
            // Perform matrix multiplication
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            
            // Print the resulting matrix
            System.out.println("Resultant Matrix after multiplication:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
        }
    }
}