// To find the sum of first n natural numbers
import java.io.*;
import java.util.*;
class sumofNatural{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the natural number: ");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
        sum=sum+i;
    }
    System.out.println("The sum of first "+n+" is "+sum);
  }
}
