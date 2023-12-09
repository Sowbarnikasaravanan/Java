/* To display the star pattern 
*****
****
***
**
*
*/
import java.util.*;
public class StarPattern02{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
