/**Write a program to accept 
 * any two integers of user's choice.
 * Compute and display all the
 * integral numbers between those
 * two numbers.
 */
import java.util.*;//package name
public class BetweenIntegers
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);//creating scanner object
        int a,b;//two integers accepted from user
        int i;
        System.out.println("TO PRINT ALL INTEGERS BETWEEN FIRST AND SECOND LIMITS");
        System.out.println("Enter the first limit:-(must be an integer)");
        a=sc.nextInt();
        System.out.println("Enter the second limit:-(must be an integer too)");
        b=sc.nextInt();
        System.out.println("The integral numbers between "+a+" and "+b+" are:-");
        for(i=a;i<=b;i++)
        {
            System.out.println(+i);
        }
        System.out.println("THE END!!");
    }
}