public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {25, 20, 3, 8, 32, 9};
        
        // Assume the first element is both the max and min
        int max = numbers[0];
        int min = numbers[0];
        
        // Loop through the array to find max and min
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        // Print the max and min values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}