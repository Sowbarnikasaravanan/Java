//To count and print the string of even length 
import java.util.*;
class EvenLengthWord{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string:");
            String str=sc.nextLine();
            String[] word=str.split(" ");
            int count=0;
            for(String w:word){
                if(w.length()%2==0){
                    System.out.println(w);
                    count++;
                }
            }
            System.out.println("The number of even length words:"+count);
    }
}
/*
Sample Output:
Enter the string:
I am Sowbarnika from CSE
am
Sowbarnika
from
The number of even length words:3
*/
