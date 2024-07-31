import java.util.*;
public class Task7{
    public static void main(String[] args) {
        String [] str = {"flower","flow","flight"};
        if(str.length == 0)
            System.out.println("String is empty");
        else if(str.length==1)
            System.out.println(str[0]);
        else
        {
            String firstStr = str[0];
            for (int i = 1; i < str.length; i++) {
                String currStr = str[i];
                int j=0;
                while(j<currStr.length() && j<firstStr.length() && firstStr.charAt(j) == currStr.charAt(j))
                {
                    j++;
                }
                if(j==0) {
                    System.out.println("This is not matched");
                    break;
                }
                firstStr = currStr.substring(0,j);
            }
            System.out.println(firstStr);
        }
    }
}
