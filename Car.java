/**Depreciated value of a car is calculated as per this tariff:-
 * NO. OF YEARS USED        RATE OF DEPRECIATION
 * 1                               - 10%
 * 2                               - 20%
 * 3                               - 30%
 * 4                               - 50%
 * Above 4                         - 60%
 * Input showroom price and number of years used.
 * Calculate the depreciated value.
 * Display it, the original price and amount paid for the car.
 */
import java.util.*;
public class Car
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int price,yr;
        double dep=0,pay=0;
        System.out.println("Enter the showroom price of the car:-");
        price=sc.nextInt();
        System.out.println("Press 1 for 1 year use");
        System.out.println("Press 2 for 2 years use");
        System.out.println("Press 3 for 3 years use");
        System.out.println("Press 4 for 4 years use");
        System.out.println("Press 5 for above 4 years use");
        System.out.println("Enter your choice:-");
        yr=sc.nextInt();
        switch(yr)
        {
            case 1:
            dep=price*0.10;
            pay=price-dep;
            break;
            case 2:
            dep=price*0.20;
            pay=price-dep;
            break;
            case 3:
            dep=price*0.30;
            pay=price-dep;
            break;
            case 4:
            dep=price*0.50;
            pay=price-dep;
            break;
            case 5:
            dep=price*0.60;
            pay=price-dep;
            break;
            default:
            System.out.println("Wrong choice entered!!!");
        }
        System.out.println("The depreciated value is Rs "+dep);
        System.out.println("The amount paid for the car:-");
        System.out.println(+pay);
    }
}