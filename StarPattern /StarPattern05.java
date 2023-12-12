/* To display the star pattern 
*****
 ****
  ***
   **
    * 
*/
import java.util.*;
public class StarPattern05{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int n=sc.nextInt();
    for(int i=n;i>0;i--){
      for(int j=0;j<n-i;j++){
        System.out.print(" ");
      }
      for(int k=0;k<i;k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
