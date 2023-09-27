//To find the sum of the natural number 
import java.io.*;
import java.util.*;
class sumofnatural{
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        number=sc.nextInt();
        int res=sum(number);
        System.out.println("The sum of first "+number+" natural number is :"+result);
    }
   public static int sum(int number){
        if(number==1){
            return 1;
        }
        else{
            return number+sum(number-1);
        }
    }
}

        
