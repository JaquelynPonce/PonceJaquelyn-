public class MatrixAddition {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };
        
        // Ensure the matrices have the same dimensions
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            int[][] result = new int[matrix1.length][matrix1[0].length];
            
            // Add corresponding elements
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[i].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            
            // Print the resulting matrix
            System.out.println("Resultant Matrix after addition:");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices must have the same dimensions for addition.");
        }
    }
}