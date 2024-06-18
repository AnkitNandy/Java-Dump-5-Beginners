/**Write a program to input
 * the two limits between which
 * the numbers has to be displayed in
 * the decreasing order.
 */
import java.util.*;//package name
public class DecreasingLoop
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);//creating scanner object
        int a,b,i;
        System.out.println("TO DISPLAY NUMBERS IN DECREASING ORDER");
        System.out.println();
        System.out.println("Enter two numbers:-");
        a=sc.nextInt();//first number
        b=sc.nextInt();//second number
        System.out.println("The decreasing order is:-");
        if (a>=b)
        {
            for(i=a;i>=b;i--)
            {
                System.out.println(+i);
            }
        }
        if (a<=b)
        {
            for(i=b;i>=a;i--)
            {
                System.out.println(+i);
            }
        }
    }
   }

        