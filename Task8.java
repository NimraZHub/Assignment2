import java.util.*;
public class Task8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ente a string");
        String str = input.nextLine();
        String newStr = "";
        char [] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int j=0;
            for ( j = 0; j<i ; j++) {
                if(arr[i] == arr[j])
                    break;
            }
            if(i==j)
            {
                newStr += arr[i];
            }
        }
        System.out.println(newStr);
        //string to char
        char [] arr1 = newStr.toCharArray();
        Arrays.sort(arr1);
        //char to string
        newStr = String.valueOf(arr1);
        System.out.println(newStr);

    }
}