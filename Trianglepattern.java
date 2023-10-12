// To display the patterns in the right angled triangle 
import java.util.*;
class Trianglepattern{
    public static void main(String args[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        num=sc.nextInt();
        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
