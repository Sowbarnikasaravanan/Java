//To find the simple interest
import java.io.*;
import java.util.*;
public class SimpleInterest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p=sc.nextInt();
        System.out.println("Enter the No. of years:");
        int n=sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int r=sc.nextInt();
        double SI=(p*n*r)/100;
        System.out.println("The simple interest is :"+SI);
    }
}

/*
Sample Output:
Enter the principal amount:1000
Enter the No. of years:
3
Enter the rate of interest:
5
The simple interest is :150.0
*/
