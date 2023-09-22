// To generate multiplication table
import java.io.*;
import java.util.*;
class multiplytable{
  public static void main(String args[]){
    int table,i,limit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the table: ");
    table=sc.nextInt();
    System.out.println("Enter the limit:");
    limit=sc.nextInt();
    for(i=1;i<=limit;i++){
        System.out.println(i+"*"+table+"="+(i*table));
    }
  }
}
