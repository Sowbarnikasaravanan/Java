//To check the number is palindrome or not
import java.io.*;
import java.util.*;
class palindrome{
  public static void main(String args[]){
    int n,rem=0,rev=0,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=sc.nextInt();
    temp=n;
    while(n>0){
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
    }
    if(temp==rev){
      System.out.println(temp+" is a palindrome");
    }
    else{
      System.out.println(temp+" is not a palindrome");
    }
  }
}
