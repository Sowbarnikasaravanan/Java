// Java program for finding the ascii value of a character
import java.io.*;
import java.util.*;
class Ascii{
  public static void main(String args[]){
    char ch;
     int c;

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the character");
    ch=s.next().charAt(0);
    c=(int)ch;
    System.out.println("The ASCII value of "+ch+" is "+c);
  }
}
