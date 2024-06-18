/**Menu driven program to calculate the maturity amount
 * of a bank deposit. The user is given the following options:-
 * Term Deposit
 * Recurring Deposit
 */
import java.util.*;
public class Deposit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float p,r,n;
        double a;
        System.out.println("TO CALCULATE DEPOSIT");
        System.out.println("Enter the principle amount:-");
        p=sc.nextFloat();
        System.out.println("Enter the rate of interest:-");
        r=sc.nextFloat();
        System.out.println("Enter the time for deposit:-");
        n=sc.nextFloat();
        System.out.println("__________________________________________________________________________");
        System.out.println("Menu List:");
        System.out.println("1.Term Deposit");
        System.out.println("2.Recurring Deposit");
        int c;
        System.out.println("Enter your choice out of 1 and 2 to find any one of them:-");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
            a=p*(Math.pow((1+r/100.0),n));
            System.out.println("Amount under term deposit is"+"\n"+"Rs "+a+".");
            break;
            case 2:
            a=p*n+p*(n*(n+1))/2.0+r/100.0*1.0/12.0;
            System.out.println("Amount under recurring deposit is"+"\n"+"Rs "+a+".");
            break;
            default:
            System.out.println("Invalid Choice!!"+"\n"+"You must enter either 1 or 2.");
        }
    }
}
        