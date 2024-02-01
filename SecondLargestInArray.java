//To find the second largest element in an array
import java.util.*;
public class SecondLargestInArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The second largest element in an array is "+arr[n-2]);
    }
}

/*
Sample Output:
Enter the size of an array:
5
Enter the elements:
8
3
5
6
2
The second largest element in an array is 6
*/
