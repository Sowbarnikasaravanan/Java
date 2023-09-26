//To check a number is armstrong or not
import java.io.*;
import java.util.*;
class armstrong{
    public static void main(String args[]){
        int number,temp,rem,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        start=sc.nextInt();
        temp=number;
        while(number>0){
            rem=number%10;
            rev=rev+rem*rem*rem;
            number/=10;
        }
        if(temp==rev){
           System.out.println(temp+" is an armstrong number ");
        }
        else{
            System.out.println(temp+" is not an armstrong number");
       }
    }
}
