//To find the lcm of two numbers
import java.io.*;
import java.util.*;
class lcm{
  public static void main(String args[]){
    int a,b,gcd=1,lcm;
    System.out.println("Enter two numbers:");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    for(int i=2;(i<=a && i<=b);i++){
        if(a%i==0 && b%i==0){
            gcd=i;
        }
    }
    lcm=(a*b)/gcd;
    System.out.println("The LCM of "+a+" and "+b+" is "+lcm);
  }
}
