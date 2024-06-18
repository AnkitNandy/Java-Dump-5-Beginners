/**To find the sum,difference and product of two numbers
 * using Switch Case.
 */
import java.util.*;
public class CaseOperations
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("- is difference.");
        System.out.println("+ is sum");
        System.out.println("* is product");
        System.out.println("/ is quotient");
        double a=0,b=0,sum=0,prod=0,diff=0,quot=0;
        System.out.println("Enter any two numbers:-");
        a=sc.nextDouble();
        b=sc.nextDouble();
        sum=a+b;
        prod=a*b;
        diff=a-b;
        quot=a/b;
        char o;
        System.out.println("Enter your choice out of +,-,* and /:-");
        o=sc.next().charAt(0);
        switch(o)
        {
            case '+':
            System.out.println("The sum of "+a+" and "+b+" is "+sum);
            break;
            case '-':
            System.out.println("The difference of "+a+" and "+b+" is "+diff);
            break;
            case '*':
            System.out.println("The product of "+a+" and "+b+" is "+prod);
            break;
            case '/':
            System.out.println("The quotient of "+a+" by "+b+" is "+quot);
            break;
            default:
            System.out.println("Wrong choice!!");
        }
    }
}