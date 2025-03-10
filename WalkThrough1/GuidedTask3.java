 import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        
        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        
        // Print the result
        System.out.println("Today's date and time: " + formattedDateTime);
    }
}

