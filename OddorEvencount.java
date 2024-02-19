// To count the number of odd and even numbers are there in a given nunber
import java.util.*;
class OddOrEvenCount {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int odd=0,even=0,rem=0;
        while(temp>0){
            rem=temp/10;
            if(rem%2==0){
                even++;
            }
            else{
                odd++;
            }
            temp/=10;
        }
        System.out.println("The number of odd numbers is "+odd+" and the number of even numbers is "+even);
    }
}
/* 
Sample Output:
Enter the number:
57874216
The number of odd numbers is 4 and the number of even numbers is 4
*/
