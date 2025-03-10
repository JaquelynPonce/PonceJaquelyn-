public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {23, 45, 67, 12, 89, 54};
        int target = 67;
        
        // Implement Linear Search
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index " + i);
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}