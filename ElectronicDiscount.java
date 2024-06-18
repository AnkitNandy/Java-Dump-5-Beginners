/**A electronic shop has announced these discounts on the purchase of certain items:
 * CATEGORY                DISCOUNT ON LAPTOP        DISCOUNT ON DESKTOP PC
 * Upto Rs 25000                   0.0%                      5.0%
 * Rs 25001 to Rs 57000            5.0%                      7.5%
 * Rs 57001 to Rs 100000           7.5%                      10.0%
 * More Than Rs 100000             10.0%                     15.0%
 * Write a menu-driven program based on above criteria,
 * to input name,ID,city,amount of purchase and the type of purchase
 * ('L' for Laptop and 'D' for Desktop).
 * Compute and print the net amount to be paid 
 * by  a customer with his name,ID and city!
 */
import java.util.*;
public class ElectronicDiscount
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String name;
        String addr;
        int ID;
        char choice;
        double amt,disc=0,namt=0;
        System.out.println("WELCOME TO THE ELECTRONICS SHOP");
        System.out.println("Enter name of the customer:-");
        name=sc.nextLine();
        System.out.println("Enter "+name+"'s Aadhar Card Number:-");
        ID=sc.nextInt();
        System.out.println("Enter address of "+name+":-");
        addr=sc.nextLine();
        System.out.println("  CATEGORY              LAPTOP DISC              DESKTOP PC DISC        ");
        System.out.println("Upto Rs 25000              0.0%                      5.0%               ");
        System.out.println("Rs 25001 to Rs 57000       5.0%                      7.5%               ");
        System.out.println("Rs 57001 to Rs 100000      7.5%                      10.0%              ");
        System.out.println("More than Rs 100000        10.0%                     15.0%              ");
        System.out.println("_______________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Enter the amount of purchase:-");
        amt=sc.nextDouble();
        System.out.println("L-Laptop");
        System.out.println("D-Desktop PC");
        System.out.println("Enter L or P for the type of purchase:-");
        choice=sc.next().charAt(0);
        switch(choice)
        {
            case 'L':
            {
            if (amt>0&&amt<=25000)
            {
                disc=0.0*amt;
                namt=amt-disc;
            }
            else if (amt>25000&&amt<=57000)
            {
                disc=0.05*amt;
                namt=amt-disc;
            }
            else if (amt>57000&&amt<=100000)
            {
                disc=0.075*amt;
                namt=amt-disc;
            }
            else if (amt>100000)
            {
                disc=0.10*amt;
                namt=amt-disc;
            }
            else
            {
                System.out.println("Wrong amount of purchase entered!!");
            }
            }
            break;
            case 'D':
            {
            if (amt>0&&amt<=25000)
            {
                disc=0.05*amt;
                namt=amt-disc;
            }
            else if (amt>25000&&amt<=57000)
            {
                disc=0.075*amt;
                namt=amt-disc;
            }
            else if (amt>57000&&amt<=100000)
            {
                disc=0.10*amt;
                namt=amt-disc;
            }
            else if (amt>100000)
            {
                disc=0.15*amt;
                namt=amt-disc;
            }
            else
            {
                System.out.println("Wrong amount of purchase entered!!");
            }
            break;
        }
            default:
            System.out.println("Wrong type of purshase entered!!"+"\n"+"You must enter either L or D.");
        }
        System.out.println("Discount:-");
        System.out.println("Rs."+disc);
        System.out.println("Net amount to be paid by "+name+":-");
        System.out.println("Rs."+namt);
}
}