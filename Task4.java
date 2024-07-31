import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Date");
        String date = input.nextLine();
        LocalDate newDate = LocalDate.parse(date);
        newDate = newDate.plusDays(30);
        String nDate = newDate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println(nDate);
    }
}
