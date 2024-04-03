// To check whether the substring is present in the string
import java.util.*;
public class SubstringIndex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the substring to be checked:");
        String str1=sc.nextLine();
        int index=str.indexOf(str1);
        if(index>=0){
            System.out.println("The substring is present at the index :"+index);
        }
        else{
            System.out.println("The substring is not present in the string");
        }
    }
}

/*Sample output:
Enter the string:
Hello world
Enter the substring to be checked:
world
The substring is present at the index :6
*/
