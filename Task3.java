import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String newDate = today.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println("Before: " +today);
        System.out.println("After: " +newDate);

    }
}
