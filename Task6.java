import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        Pattern pattern = Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]");
        Matcher matcher = pattern.matcher(str);
        boolean c = matcher.matches();
        String msg = (c)? "valid" : "invalid";
        System.out.println(msg);
    }
}