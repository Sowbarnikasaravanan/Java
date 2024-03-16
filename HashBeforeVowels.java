// To place '#' before vowels in a string
import java.util.*;
public class HashBeforeVowels{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String a=sc.nextLine();
        String b="";
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' ||c=='e' || c=='i' || c=='o' || c=='u'){
                b+='#';
            }
            b+=c;
        }
        System.out.println(b);
    }
}

/*
Sample output:
Enter the string:
sowbarnika
s#owb#arn#ik#a
*/
