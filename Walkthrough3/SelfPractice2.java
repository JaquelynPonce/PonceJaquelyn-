import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 20, 50, 30};
        
        // Use HashSet to remove duplicates
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        
        // Add elements to the set
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }
        
        // Convert the set back to an array
        Integer[] uniqueArray = uniqueNumbers.toArray(new Integer[0]);
        
        // Print the array with duplicates removed
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}