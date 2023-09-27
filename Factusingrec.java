//To find the factorial of a number
import java.io.*;
import java.util.*;
class fctusingrec{
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int res=fact(number);
        System.out.println("The factorial of "+number+" is :"+res);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}

        
