//To perform matrix addition using java 
import java.util.*;
public class MatrixAddition{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size of first matrix:");
        int row1=sc.nextInt();
        System.out.println("Enter the column size of first matrix:");
        int col1=sc.nextInt();
        System.out.println("Enter the row size of second matrix:");
        int row2=sc.nextInt();
        System.out.println("Enter the column size of second matrix:");
        int col2=sc.nextInt();
        int[][] a=new int[row1][col1];
        int[][] b=new int[row2][col2];
        int[][] add=new int[row1][col1];
        if(row1==row2 && col1==col2){
            System.out.println("Enter the elements of first matrix :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements of second matrix :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("The addition of two matrix is :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    add[i][j]=a[i][j]+b[i][j];
                    System.out.print(add[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Addition cannot be performed");
        }
    }
}
