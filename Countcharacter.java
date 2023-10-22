//To count the number of characters present in a string 
import java.util.*;
class CountCharacters{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
                count++;
            }
        }
        System.out.println("The number of characters are :"+count);
    }
}
