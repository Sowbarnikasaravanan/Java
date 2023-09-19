// Swapping of numbers 
import java.io.*;
import java.util.*;
class Swap{
  public static void main(String args[]){
    int a,b,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number:");
    a=sc.nextInt();
    System.out.println("Enter second number:");
    b=sc.nextInt();
    System.out.println("Before Swapping :"+a+ "\n " +b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("After swapping:"+a+"\n "+b);
  }
}
