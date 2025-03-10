import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array with the specified size
        int[] array = new int[size];
        
        // Accept array elements from the user
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Print the array elements
        System.out.print("You entered: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}