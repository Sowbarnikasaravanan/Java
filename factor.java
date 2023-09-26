//To find the factors of a number
import java.io.*;
import java.util.*;
class armstrong{
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        number=sc.nextInt();
        System.out.println("The factors of "+number+" :");
        for(int i=2;i<=number;i++){
            if(number%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
