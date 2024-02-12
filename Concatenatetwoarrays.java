//To concatenate two arrays
import java.util.*;
public class ConcatenatetwoArrays{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements of an array1:");
		int n1=sc.nextInt();
		System.out.println("Enter the number of elements of an array2:");
		int n2=sc.nextInt();
		int a[]=new int[50];
		int b[]=new int[50];
		System.out.print("Enter the elements of first array:");
		for(int i=0;i<n1;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the elements of second array:");
		for(int k=0;k<n2;k++){
			b[k]=sc.nextInt();
		}
		int i=0,temp;
		for(int j=n1;j<n1+n2;j++){
			a[j]=b[i++];
		}
		System.out.println("The elements after concatenation:");
		for(i=0;i<n1+n2;i++){
				System.out.println(a[i]);               	
		}
	}
}

/*
Sample Output:
Enter the number of elements of an array1:
4
Enter the number of elements of an array2:
4
Enter the elements of first array:1
2
3
4
Enter the elements of second array:5
6
7
8
The elements after concatenation:
1
2
3
4
5
6
7
8
*/
