//To find the factorial of a number
import java.io.*;
import java.util.*;
class Factorial{
  public static void main(String args[]){
    int number;
    long fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    number=sc.nextInt();
    for(int i=1;i<=number;i++){
        fact=fact*i;
    }
    System.out.println("The factorial of "+number+" is "+fact);
  }
}
