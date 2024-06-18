/**This program is to first accept
 * an integral number from the user
 * and then to compute and display 
 * the factorial of the given number.
 */
import java.util.*;
public class Factorial
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i;//n is user's input
        int fact=1;//fact stands for factorial
        System.out.println("TO FIND THE FACTORIAL OF A GIVEN NUMBER");
        System.out.println();
        System.out.println("Enter an integral number:-");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" = ");
        System.out.println(+fact);
    }
}