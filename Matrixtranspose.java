//To perform the transpose of a matrix 
import java.util.*;
public class MatrixTranspose{
    public static void main(String args[]){
        int row,col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row :");
        row=sc.nextInt();
        System.out.println("Enter the size of the column:");
        col=sc.nextInt();
        int[][] a=new int[row][col];
        System.out.println("Enter the elements of the matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of the matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The transpose matrix is :");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

/*
Enter the size of the row :
3
Enter the size of the column:
4
Enter the elements of the matrix:
6
7
3
5
9
1
4
2
6
8
7
4
The elements of the matrix :
6 7 3 5 
9 1 4 2 
6 8 7 4 
The transpose matrix is :
6 9 6 
7 1 8 
3 4 7 
5 2 4 
*/
