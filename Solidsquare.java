// To display the solid square pattern 
import java.util.*;
public class Solidsquare{
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number of rows :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i = 1; i <= n; i++){ 
            for(int j = 1; j <= n; j++){
                System.out.print("* "); 
            }
            System.out.print("\n"); 
        }
    }
}
