// To check two strings are anagram to each other
import java.util.*;
class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            char[] a=s1.toCharArray();
            char[] b=s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            int flag=0;
            for(int i=0;i<s1.length();i++){
                if(a[i]!=b[i]){
                    System.out.println("Not an anagram");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(s1+" and " +s2+" are anagram to each other");
            }
        }
        else{
            System.out.println("Not an anagram");
        }
    }
}

/*
Sample Output:
Enter two strings:
Race
care
Race and care are anagram to each other
*/
