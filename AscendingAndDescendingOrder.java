/*This program is to firs input any 3 numbers.
 * Then to arrange them either in 
 * ascending or descending order
 * based upon user's choice
 */
import java.util.*;
public class AscendingAndDescendingOrder
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        int d;//d is choice
        System.out.println("Enter three numbers:-");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        System.out.println("Press 1 for descending order.");
        System.out.println("Press 2 for ascending order.");
        System.out.println("Enter your choice:-");
        d=sc.nextInt();
        switch(d)
        {
            case 1:
            System.out.println("The descending order is:-");
            if (a>b&&a>c)
            {
                if (b>=c)
                System.out.println(a+", "+b+" and "+c);
                else 
                System.out.println(a+", "+c+" and "+b);
            }
            else if (b>a&&b>c)
            {
                if (a>=c)
                System.out.println(b+", "+a+" and "+c);
                else
                System.out.println(b+", "+c+" and "+a);
            }
            else if (c>a&&c>b)
            {
                if (a>=b)
                System.out.println(c+", "+a+" and "+b);
                else
                System.out.println(c+", "+b+" and "+a);
            }
            else
            System.out.println("All the three numbers are equal");
            break;
            case 2:
            System.out.println("The ascending order is:-");
            if (a<b&&a<c)
                {
                    if (b<=c)
                    System.out.println(a+", "+b+" and "+c);
                    else
                    System.out.println(a+", "+c+" and "+b);
                }
                else if (b<a&&b<c)
                {
                    if (a<=c)
                    System.out.println(b+", "+a+" and "+c);
                    else
                    System.out.println(b+", "+c+" and "+a);
                }
                else if (c<a&&c<b)
                {
                    if (a<=b)
                    System.out.println(c+", "+a+" and "+b);
                    else
                    System.out.println(c+", "+b+" and "+a);
                }
                else
            System.out.println("All the three numbers are equal");
            break;
            default:
            System.out.println("Sorry, You have entered a wrong choice!!"+"\n"+"You must enter either 1 or 2.");
        }
    }
}