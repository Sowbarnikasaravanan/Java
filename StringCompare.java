//To compare two strings that are equal or not
import java.util.*;
public class StringCompare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.next();
        System.out.println("Enter the second string:");
        String s2=sc.next();
        if(s1.equals(s2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
}
