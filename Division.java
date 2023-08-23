// To find the quotient and remainder of a number
import java.io.*;
import java.util.*;
class Division{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num,quot,rem,div;
    System.out.println("Enter the dividend");
    num=s.nextInt();
    System.out.println("Enter the divisor:");
    div=s.nextInt();
    quot=num/div;
    rem=num%div;
    System.out.println("The quotient and remainder when "+num+ " is divided by "+div+" is "+quot+" and "+rem);
  }
}


    
