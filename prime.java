//To check whether the given number is prime or not
import java.io.*;
import java.util.*;
class prime{
  public static void main(String args[]){
    int number,count=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    number=sc.nextInt();
    for(int i=2;i<number;i++){
      if(number%i==0){
          count++;
      }
    }
    if(count==1){
      System.out.println(number+" is a prime number");
    }
    else{
      System.out.println(number+" is not a prime number");
    }
  }
}
      
    
