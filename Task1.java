import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string as an input to check whether it is palindrome or not");
        String str=input.nextLine();
        boolean flag =true;
        for(int i=0; i<str.length()/2; i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Palendrome");
        }
        else
        {
            System.out.println("Not palendrome");
        }
    }
}