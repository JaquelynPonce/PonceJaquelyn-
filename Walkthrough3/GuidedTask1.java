public class StudentGrades {
    public static void main(String[] args) {
        // Array of student grades
        int[] grades = {80, 90, 83, 92, 88};
        int sum = 0;
        
        // Calculate the sum of grades
        for (int grade : grades) {
            sum += grade;
        }
        
        // Calculate the average
        double average = (double) sum / grades.length;
        
        // Print the average
        System.out.println("The average grade is: " + average);
    }
}