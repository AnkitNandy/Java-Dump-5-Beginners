/**to input sum invested.
 * then to calculate and
 * display the compond interest yearly
 */
import java.util.*;
public class Compound_interest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        float sum;
        double i1,i2,i3,a3;
        System.out.println("Enter name of the investor:-");
        name=sc.nextLine();
        System.out.println("Enter the sum invested by "+name+":-");
        sum=sc.nextFloat();
        i1=(int)((sum*Math.pow(1.0+0.05/12.0,12.0*1.0))-sum);
        i2=(int)((sum*Math.pow(1.0+0.05/12.0,12.0*2.0))-sum);
        a3=(int)(sum*Math.pow(1.0+0.05/12.0,12.0*3.0));
        System.out.println("The interest for the first year is Rs."+i1);
        System.out.println("The interest for the second year is Rs."+i2);
        System.out.println("The amount after three years is Rs."+a3);
    }
}
        