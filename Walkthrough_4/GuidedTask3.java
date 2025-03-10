public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {12, 23, 45, 54, 67, 89};
        int target = 67;
        
        // Implement Binary Search
        int left = 0;
        int right = array.length - 1;
        boolean found = false;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if target is at mid
            if (array[mid] == target) {
                found = true;
                System.out.println("Element " + target + " found at index " + mid);
                break;
            }
            
            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}