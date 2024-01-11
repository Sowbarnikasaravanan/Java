/*
Arithmetic Operator
+   ->Addition
-   ->Subtraction
*   ->Multiplication
/   ->Division
%   ->Modulus
*/
import java.util.*;
public class ArithmeticOperator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Addition of"+a+" and "+b+" is "+(a+b));
        System.out.println("Subtraction of"+a+" and "+b+" is "+(a-b));
        System.out.println("Multiplication of"+a+" and "+b+" is "+(a*b));
        System.out.println("Quotient when "+a+" divides "+b+" is "+(a/b));
        System.out.println("Remainder when "+a+" divides "+b+" is "+(a%b));
    }
}

/*
Enter the first number:
10
Enter the second number:
8
Addition of 10 and 8 is 18
Subtraction of 10 and 8 is 2
Multiplication of 10 and 8 is 80
Quotient when 10 divides 8 is 1
Remainder when 10 divides 8 is 2
*/
