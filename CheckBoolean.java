//To check whether there is atleast 2 boolean true variables
import java.util.*;
public class CheckBoolean{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three boolean values:");
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        boolean c=sc.nextBoolean();
        boolean result;
        if(a){
            result=(b||c);
        }
        else{
            result=(b && c);
        }
        if(result){
            System.out.println("There are atleast two boolean values as True");
        }
        else{
            System.out.println("There are atleast two boolean variables as False");
        }
    }
}
