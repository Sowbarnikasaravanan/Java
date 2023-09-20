//To find the given character is vowel or not
import java.io.*;
import java.util.*;
class Vowelornot{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a letter:");
    char a=sc.next().charAt(0);
    if(a=='a'|| a=='e' ||a=='i' ||a=='o' ||a=='u' ||a=='A'||a=='E' ||a=='I' || a=='O' || a=='U'){
        System.out.println(a+" is a Vowel");
    }
    else{
      System.out.println(a+" is a consonant");
    }
 }
}
