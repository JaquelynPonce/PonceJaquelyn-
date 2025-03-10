public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        
        // Check if the matrix is square (rows == columns)
        if (matrix.length == matrix[0].length) {
            boolean isSymmetric = true;
            
            // Check if the matrix is symmetric
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
            }
            
            // Print the result
            if (isSymmetric) {
                System.out.println("The matrix is symmetric.");
            } else {
                System.out.println("The matrix is not symmetric.");
            }
        } else {
            System.out.println("Matrix must be square to check for symmetry.");
        }
    }
}