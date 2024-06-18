/**To input two angles.
 * Calculate and display whether
 * they are complementary or supplementary,
 */
import java.util.*;
public class ComplementaryandSupplementary
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0;
        System.out.println("Enter first angle:-");
        a=sc.nextInt();
        System.out.println("Enter second angle:-");
        b=sc.nextInt();
        sum=a+b;
        if (sum==90)
        System.out.println(a+" and "+b+" are COMPLEMENTARY ANGLES.");
        else if (sum==180)
        System.out.println(a+" and "+b+" are SUPPLEMENTARY ANGLES.");
        else
        System.out.println(a+" and "+b+" are neither COMPLEMENTARY nor SUPPLEMENTARY ANGLES.");
    }
}
        