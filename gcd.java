//To find the gcd of two numbers
import java.io.*;
import java.util.*;
class gcd{
  public static void main(String args[]){
    int a,b,gcd=1;
    System.out.println("Enter the numbers a and b:");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    for(int i=2;(i<=a && i<=b);i++){
        if(a%i==0 && b%i==0){
            gcd=i;
        }
    }
    System.out.println("The GCD of "+a+" and "+b+" is "+gcd);
  }
}
      
