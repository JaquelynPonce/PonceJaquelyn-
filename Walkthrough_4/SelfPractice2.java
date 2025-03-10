public class InsertionSortStrings {
    public static void main(String[] args) {
        String[] array = {"Strawberry", "Apple", "Guava", "Orange", "Pineapple"};
        
        // Implement Insertion Sort
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int j = i - 1;
            
            // Shift elements of array[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        
        // Print the sorted array
        System.out.println("Sorted array of strings using Insertion Sort:");
        for (String str : array) {
            System.out.print(str + " ");
        }
    }
}