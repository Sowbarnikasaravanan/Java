// To display the pattern in the inverted triangle  
import java.util.*;
class InvertedTriangle{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        num=sc.nextInt();
        for(int i=num;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
