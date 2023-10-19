// To find the average of elements in an array 
import java.util.*;
public class AverageInArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        float average=sum/n;
        System.out.println("The average of "+n+" elements is:"+average);
    }
}
            
