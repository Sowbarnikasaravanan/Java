// To find all the prime numbers between the two intervals
import java.io.*;
import java.util.*;
class primebtnintervals{
  public static void main(String args[]){
    int start,end,i,count;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the starting point:");
      start=sc.nextInt();
      System.out.println("Enter the ending point:");
      end=sc.nextInt();
      System.out.println("The prime numbers between "+start+" is "+end);
      for(i=start;i<=end;i++){
          count=1;
          for(int j=2;j<=start;j++){
            if(i%j==0){
                count=count+1;
            }
          }
          if(count==1){
           System.out.println(i+" ");
          }
       }
      }
  }
