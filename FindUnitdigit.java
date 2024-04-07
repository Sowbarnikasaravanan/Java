// To find the unit digit of a number
import java.util.*;
class FindUnitDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int unit=n%10;
        System.out.println("The unit digit of "+n+" is "+unit);
    }
}
/*
Sample Output:
Enter the number:
56789
The unit digit of 56789 is 9
*/
