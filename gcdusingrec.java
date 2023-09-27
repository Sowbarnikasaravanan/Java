//To find the gcd of two numbers using recursion
import java.io.*;
import java.util.*;
class gcdusingrec{
    public static void main(String args[]){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        n1=sc.nextInt();
        System.out.println("Enter the second number:");
        n2=sc.nextInt();
        int res=gcd(n1,n2);
        System.out.println("The GCD of "+n1+" and "+n2+" is :"+res);
    }
    public static int gcd(int n1,int n2){
        if(n2!=0){
            return gcd(n1,n1%n2);
        }
        else{
            return n1;
        }
    }
}

        
