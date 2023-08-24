// program for swapping two numbers
import java.io.*;
import java.util.*;
public class swap{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1=sc.nextInt();
    System.out.println("Enter the second number:");
    int num2=sc.nextInt();
    int temp;
    System.out.println("Before Swapping :\n number 1:="+num1+" \tnumber 2="+num2);
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("After Swapping :\n number 1:="+num1+" \tnumber 2="+num2);
  }
}
