// To find the compund interest
import java.io.*;
import java.util.*;
public class CompundInterest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int p=sc.nextInt();
        System.out.println("Enter the No. of years:");
        int n=sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int r=sc.nextInt();
        double amount=p*(Math.pow((1+r/100),n));
        double CI=amount-p;
        System.out.println("The compund interest is :"+CI);
    }
}

