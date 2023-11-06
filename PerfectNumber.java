//To check whether the number is perfect or not
import java.util.*;
public class PerfectNumber{
	public static void main(String args[]){
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum+=i;
			}
		}
		if(number==sum){
			System.out.println(number+" is a perfect number");
		}
		else{
			System.out.println(number+" is not a perfect number");
		}
	}
}
