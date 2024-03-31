//To count the number of special characters in a string
import java.util.*;
public class countspecialcharacters{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
                count++;
            }
        }
        System.out.println("The number of special characters:"+count);
    }
}

/*
Sample Output:
Enter the string:
s.sowbarnika@2002
The number of special characters:2
*/
