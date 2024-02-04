//Example for while loop
import java.util.*;
public class WhileLoopExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i=1;
        while(i<n){
            System.out.println(i);
            i++;
        }
    }
}

/*
Sample output:
Enter the number:
5
1
2
3
4
*/
