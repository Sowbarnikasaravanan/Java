//To check whether a number is odd or even 
import java.io.*;
import java.util.*;
class OddorEven{
  public static void main(String args[]){
    int number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to check:");
    number=sc.nextInt();
    if(number%2==0){
      System.out.println(number+" is an even number");
    }
    else{
      System.out.println(number+"is a odd number");
    }
  }
}
