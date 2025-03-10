import java.util.Scanner;

public class ExitInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        // Do-while loop to keep asking for input until "exit" is entered
        do {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("exit"));
        
        System.out.println("You have exited the program.");
        
        scanner.close();
    }
}