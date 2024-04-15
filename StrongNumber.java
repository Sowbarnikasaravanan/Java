/* To check whether a number is strong number or not 
Strong number -> The sum of the factorial of the digits of a number
145 -> 1! + 4! + 5! = 145
*/
import java.util.*;
class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int t=n;
        int rem=0,fact=1,sum=0;
        while(t>0){
            rem=t%10;
            fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum+=fact;
            t/=10;
        }
        if(n==sum){
            System.out.println(n+" is strong number");
        }
        else{
            System.out.println(n+" is not a strong number");
        }
    }
}

/*
Sample Output:
Enter the number:
145
145 is strong number

Enter the number:
541
541 is not a strong number
*/
