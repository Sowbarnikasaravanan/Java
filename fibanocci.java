//To print the fibanocci sequence
import java.io.*;
import java.util.*;
class fibanocci{
  public static void main(String args[]){
    int fib=0,t1=0,t2=1,next,n;
    System.out.println("Enter the number of terms:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for( int i=0;i<n;i++){
        System.out.println(t1+" " );
        next=t1+t2;
        t1=t2;
        t2=next;
    }
  }
}
      
