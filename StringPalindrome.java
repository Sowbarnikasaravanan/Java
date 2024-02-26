To check whether  the string is palindrome or not 
import java.util.*;
class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String a=sc.nextLine();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);
        }
        if(rev.equals(a)){
            System.out.println(a+" is a palindrome");
        }
        else{
            System.out.println(a+" is not a palindrome ");
        }
    }
}

/*
Sample Output:
Enter the string:
level
level is a palindrome
*/
