//To reverse the number
import java.io.*;
import java.util.*;
class Reverse{
  public static void main(String args[]){
    int n,rem=0,rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=sc.nextInt();
    while(n>0){
      rem=n%10;
      rev=rev*10+rem;
      n=n/10;
    }
    System.out.println("The reverse of a number:"+rev);
  }
}
