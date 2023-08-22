import java.io.*;
import java.util.*;
class Multiplication {
  public static void main(String args[]){
  float a,b,mul;
  Scanner in=new Scanner(System.in);
  System.out.println("Enter the first number");
  a=in.nextFloat();
  System.out.println("Enter the second number");
  b=in.nextFloat();
  mul=a*b;
  System.out.println("The multiplication of "+a+"and " +b+ "is " +mul);
  }
}
