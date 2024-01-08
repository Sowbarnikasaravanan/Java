/* The relational operators
<   ->Lesser than
>   ->Greater than
<=  ->Less than or equal to
>=  ->Greater than or equal to
==  ->Equal to
!=  ->Not equal to
*/
//Example for relational operator
import java.util.*;
public class RelationalOperator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than"+b);
        }
        else if(a<b){
            System.out.println(a+" is less than "+b);
        }
        else if(a==b){
            System.out.println(a+" is equal to "+b);
        }
        else{
            System.out.println("It is not a number");
        }
    }
}
