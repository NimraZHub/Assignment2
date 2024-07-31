import java.util.*;
public class Task5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        String str = input.nextLine();
        int cInt= Integer.parseInt(str);
        String [] romNumChars = {"M","CM", "D", "C", "XC","L", "X", "IX", "V", "I"};
        int [] romNumVal = {1000, 900, 500, 100, 90, 50, 10, 9, 5, 1};
        String rnVal = " ";
        for(int i=0; i<romNumVal.length; i++)
        {
            int num = cInt/romNumVal[i];
            if(num==0)
                continue;
            rnVal += (num == 4 && i>0)? romNumChars[i] + romNumChars[i-1] : romNumChars[i];
            cInt %= romNumVal[i];

        }
        System.out.println("Roman number is: " + rnVal);
    }
}