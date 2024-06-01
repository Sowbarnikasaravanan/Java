// To Find duplicate words in java
import java.util.*;
public class DuplicateWords{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String str[]=s.split(" ");
        for(String i:str){
            System.out.println(i);
        }
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].equals(str[j])){
                    System.out.println(str[i]);
                }
            }
        }
    }
}
/*
Enter the string:
I am Sowbarnika and I am a student 
i
am
*/
