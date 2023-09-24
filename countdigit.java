//To count the number of digits in an integer
import java.io.*;
import java.util.*;
class countint{
  public static void main(String args[]){
    int n,rem=0,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=sc.nextInt();
    while(n>0){
      rem=n%10;
      n=n/10;
      count++;
    }
    System.out.println("The number of digits: "+count);
  }
}
