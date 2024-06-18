/**A dealer sells
 * a) Cricket Bats
 * b) Balls in boxes containing 20 each 
 * c) Pads
 * 
 * WAP in Java to create a bill using the following
 * information given below:
 * INPUT : Date of purchase, name of the buyer,
 * price of each item on that date, quantity of
 * each item. Calculate the total amount, add 15% 
 * sales tax if the total is greater than Rs.1500,
 * 10% if it is greater than Rs.1000 or 5% otherwise.
 * 
 * _________________________________________________________
 * S.NO        ITEM        PRICE        QTY.        AMOUNT
 * _________________________________________________________
 *                                      Amount      XXXXXX
 * _________________________________________________________
 */
import java.util.*;
class Cricket
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date of purchase:");
        int date = sc.nextInt();
        System.out.println("Enter the name of the buyer:");
        String name = sc.next();
        System.out.println("\nEnter the price of Cricket Bats:");
        double bats = sc.nextDouble();
        System.out.println("Enter its quantity:");
        int q1 = sc.nextInt();
        double a1 = bats*q1;
        System.out.println("\nEnter the price of a box containing 20 balls each:");
        double balls = sc.nextDouble();
        System.out.println("Enter its quantity:");
        int q2 = sc.nextInt();
        double a2 = balls*q2;
        System.out.println("\nEnter the price of Pads:");
        double pads = sc.nextDouble();
        System.out.println("Enter its quantity:");
        int q3 = sc.nextInt();
        double a3 = pads*q3;
        double amt = (bats*q1) + (balls*q2) + (pads*q3);
        double fmt = 0.0;
        if (amt>1500)
        fmt = amt + (15.0/100.0*amt);
        else if (amt>1000)
        fmt = amt + (10.0/100.0*amt);
        else
        fmt = amt + (5.0/100.0*amt);
        System.out.println("\n___________________________________________________________________________________________");
        System.out.println("S.NO\t\tITEM\t\tPRICE\t\tQTY.\t\tAMOUNT");
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("  1.\t\tCricket Bats\t\t"+bats+"\t\t"+q1+"t\t"+a1);
        System.out.println("  2.\t\tBoxes with 20 balls\t\t"+balls+"\t\t"+q2+"\t\t"+a2);
        System.out.println("  3.\t\tPads\t\t"+pads+"\t\t"+q3+"\t\t"+a3);
        System.out.println("    \t\t    \t\t        \t\t     AMOUNT : "+fmt);
    }
}