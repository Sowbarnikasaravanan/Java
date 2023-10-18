// To count the number of vowels and consonants
import java.util.*;
public class VowelorConsonantCount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String sent=sc.nextLine();
        int count=0,c=0;
        char ch;
        for(int i=0;i<sent.length();i++){
            ch=sent.charAt(i);
            if(ch=='A'|| ch=='a' || ch=='E'||ch=='e'||ch=='I'|| ch=='i' || ch=='O'||ch=='o'||ch=='U' || ch=='u'){
                c++;
            }
            else{
                if((ch>='B'&& ch<='Z')||(ch>='b'&&ch<='z')){
                    count++;
               }
            }
        }
        System.out.println("The number of vowels:"+c);
        System.out.println("The number of consonants:"+count);
    }
}


