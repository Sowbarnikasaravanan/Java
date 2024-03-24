// To print all the common factors between two numbers 
import java.util.*;
public class PrintCommonFactors{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int n=(a<=b) ? a : b;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

/*
Sample output:
Enter first number:
4
Enter the second number:
8
1 2 4 
*/
