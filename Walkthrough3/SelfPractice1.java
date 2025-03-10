import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        
        // Create a new array to store the merged arrays
        int[] mergedArray = new int[array1.length + array2.length];
        
        // Copy elements from array1
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        
        // Copy elements from array2
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        
        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}