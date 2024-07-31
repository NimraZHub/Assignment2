import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is valid email or not");
        String email=input.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-z]+\\d+|[a-zA-z]+|[a-zA-z]+.[a-zA-z])+@gmail.com");
        Matcher matcher = pattern.matcher(email);
        // Check if the email matches the pattern
        boolean c = matcher.matches();
        String msg = (c)? "valid" : "invalid";
        System.out.println(msg);
    }
}
