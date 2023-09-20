//To find the largest number among 3 numbers
import java.io.*;
import java.util.*;
class Largest{
  public static void main(String args[]){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 3 numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>=b && a>=c){
      System.out.println(a+" is the largest number");
    }
    else if(a<=b && b>=c){
      System.out.println(b+" is the largest number");
    }
    else{
      System.out.println(c+" is the largest number");
    }
  }
}
