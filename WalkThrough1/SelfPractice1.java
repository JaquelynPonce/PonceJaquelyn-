import java.util.Scanner;

public class GreetingWithUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Print greeting message with name and age
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
        scanner.close();
    }
}