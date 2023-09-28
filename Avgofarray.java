// To find the average of an array elements
import java.io.*;
import java.util.*;
class Avginarray{
    public static void main(String args[]){
        double avg,number[20],n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            number[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++){
            sum=sum+number[i];
        }
        avg=sum/n;
        System.out.println("The average is :"+avg);
    }
}
    
