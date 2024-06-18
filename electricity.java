/**To calculate the electricity bill of a consumer as per these conditions:-
 * upto 100 units - Rupees 5.50/unit
 * for next 200 units - Rupees 6.50/unit
 * for next 300 units - Rupees 7.50/unit
 * more than 600 units - Rupees 8.50/unit
 */
import java.util.*;
public class electricity
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;//consumer's name
        int u;//u stands for units consumed
        int n;//consumer number
        double amt=0;
        System.out.println("              Money Receipt              ");
        System.out.println("Enter consumer's name:-");
        name=sc.nextLine();
        System.out.println("Enter consumer's number:-");
        n=sc.nextInt();
        System.out.println("Enter units consumed:-");
        u=sc.nextInt();
        if (u<=100)
        amt=u*5.50;
        if (u>100&&u<=300)
        amt=100*5.50+(u-100)*6.50;
        if (u>300&&u<=600)
        amt=100*5.50+200*6.50+(u-300)*7.50;
        if (u>600)
        amt=100*5.50+200*6.50+300*7.50+(u-600)*8.50;
        System.out.println("Amount to be paid:-"+"\n"+"RS"+amt);
    }
}