/**A cloth showroom has announced
 * the following festival discounts
 * and the assured gifts on the
 * purchase of items, based on the
 * total cost of the items purchased:
 *         TOTAL COST                      DISCOUNT                   ASSURED GIFT
 *  Less than or upto Rs 2000                 5%                       Wall Clock
 *     Rs 2001 to Rs 5000                    10%                       School Bag
 *      Rs 5001 to 10000                     15%                     Electric Iron
 *     More than Rs 10000                    20%                      Wrist Watch
 *     Write a program to input the total cost 
 *     of the item purchased, discount, amount
 *     to be paid after availing discount and
 *     the assured gift.
 */
import java.util.*;
public class ClothShowroom
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int cost;
        double disc,amt;
        System.out.println("WELCOME TO CLOTH SHOWROOM");
        System.out.println("         TOTAL COST                      DISCOUNT                   ASSURED GIFT");
        System.out.println("  Less than or upto Rs 2000                 5%                       Wall Clock");
        System.out.println("     Rs 2001 to Rs 5000                    10%                       School Bag");
        System.out.println("      Rs 5001 to 10000                     15%                     Electric Iron");
        System.out.println("     More than Rs 10000                    20%                      Wrist Watch");
        System.out.println("_______________________________________________________________________________________________________");
        System.out.println("Enter the cost of the item purchased:-");
        cost=sc.nextInt();
        if (cost<=2000&&cost>0)
        {
            disc=cost*0.05;
            amt=cost-disc;
            System.out.println("Discount is Rs "+disc+".");
            System.out.println("After availing discount, amount to be paid is Rs "+amt+".");
            System.out.println("Gift: Wall Clock");
        }
        else if (cost>2000&&cost<=5000)
        {
            disc=cost*0.10;
            amt=cost-disc;
            System.out.println("Discount is Rs "+disc+".");
            System.out.println("After availing discount, amount to be paid is Rs "+amt+".");
            System.out.println("Gift: School Bag");
        }
        else if (cost>5000&&cost<=10000)
        {
            disc=cost*0.15;
            amt=cost-disc;
            System.out.println("Discount is Rs "+disc+".");
            System.out.println("After availing discount, amount to be paid is Rs "+amt+".");
            System.out.println("Gift: Electric Iron");
        }
        else if (cost>10000)
        {
            disc=cost*0.20;
            amt=cost-disc;
            System.out.println("Discount is Rs "+disc+".");
            System.out.println("After availing discount, amount to be paid is Rs "+amt+".");
            System.out.println("Gift: Wrist Watch");
        }
        else
        System.out.println("Wrong cost price entered by the user!!"+"\n"+"Check it out.");
    }
}