/**Bank of India gives new rates for term deposit schemes
 * for customers and senior citizens.
 *     Term          Rate of Interest(General)         Rate of Interest(Seniors)
 * upto 1 year            - 7.5%                               - 8.0%
 * upto 2 years           - 8.5%                               - 9.0%
 * upto 3 years           - 9.5%                               - 10.0%
 * more than 3 years      - 10.0%                              - 11.0% 
 */
import java.util.*;
public class BankOfIndia
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int amtd,term,age;
        double i=0,fmt=0;
        System.out.println("Enter amount deposited:-");
        amtd=sc.nextInt();
        System.out.println("Enter the age:-");
        age=sc.nextInt();
        System.out.println("Enter the term:-");
        term=sc.nextInt();
        if (age<60)
        {
            if (term<=1)
            {
                i=amtd*0.075;
                fmt=amtd+i;
            }
            if (term>1&&term<=2)
            {
                i=amtd*0.085;
                fmt=amtd+i;
            }
            if (term>2&&term<=3)
            {
                i=amtd*0.095;
                fmt=amtd+i;
            }
            if (term>3)
            {
                i=amtd*0.10;
                fmt=amtd+i;
            }
        }
        else
        {
            if (term<=1)
            {
                i=amtd*0.08;
                fmt=amtd+i;
            }
            if (term>1&&term<=2)
            {
                i=amtd*0.09;
                fmt=amtd+i;
            }
            if (term>2&&term<=3)
            {
                i=amtd*0.10;
                fmt=amtd+i;
            }
            if (term>3)
            {
                i=amtd*0.11;
                fmt=amtd+i;
            }
        }
        System.out.println("Amount Deposited   Term    Age    Interest earned   Amount Paid");
        System.out.println("    "+amtd+"                                                   ");
        System.out.println("                 "+term+"                                      ");
        System.out.println("                         "+age+"                               ");
        System.out.println("                                    "+i+"                      ");
        System.out.println("                                                    "+fmt+"    ");
    }
}