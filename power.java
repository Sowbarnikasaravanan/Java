//To find the power of a number
import java.io.*;
import java.util.*;
class power{
  public static void main(String args[]){
    int base,pow,power=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base :");
    base=sc.nextInt();
    System.out.println("Enter the power for a number:");
    pow=sc.nextInt();
    for(int i=1;i<=pow;i++){
        power=base*power;
    }
    System.out.println("The power of "+base+" to "+pow+" is "+power);
  }
}
