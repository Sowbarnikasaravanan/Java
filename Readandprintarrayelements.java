// To read and print the elements of an array 
import java.util.*;
import java.io.*;
class ReadAndPrintArrayElements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements in an array are:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

/*
Sample output:
Enter the size of an array:5
Enter the elements:
3
5
8
2
4
The elements in an array are:
3 5 8 2 4 
*/
