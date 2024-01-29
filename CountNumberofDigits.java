//To count the number digits of a number
import java.util.*;
public class CountDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int N=sc.nextInt();
    int temp=N;
	  int count=0;
	  while(N>0){
	     N/=10;
	     count++;
	  }
	  System.out.print("The number of digits in "+temp+" is "+count);
	}
}

/*
Sample Output:
Enter the number:
192837465
The number of digits in 192837465 is 9
*/
