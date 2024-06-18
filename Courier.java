/**Courier company charges for an ordinary and express mail
 * based on the weight of the parcel as per this tariff:
 * Weight of parcel        Charge on ordinary mail        Charge on express mail
 * upto 100 grams               - Rs 50                         - Rs 80
 * 101 to 500 grams             - Rs 40/100gms                  - Rs 70/100gms
 * 501 and above                - Rs 35/100gms                  - Rs 65/100gms
 */
import java.util.*;
public class Courier
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int weight;
        double charge;
        char type;
        char O=0;
        char E=0;;
        System.out.println("Enter weight of the parcel(in gms):-");
        weight=sc.nextInt();
        System.out.println("Enter type of parcel(O for ordinary&E for express):-");
        type=sc.next().charAt(0);
        if (type=='O')
        {
            if (weight>0&&weight<=100)
            {
                charge=50*1;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>100&&weight<=200)
            {
                charge=40*2;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>200&&weight<=300)
            {
                charge=40*3;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>300&&weight<=400)
            {
                charge=40*4;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>400&&weight<=500)
            {
                charge=40*5;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>500)
            {
                charge=35*6;
                System.out.println("Minimum charge is Rs "+charge);
            }
        }
        if (type=='E')
        {
            if (weight>0&&weight<=100)
            {
                charge=80*1;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>100&&weight<=200)
            {
                charge=70*2;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>200&&weight<=300)
            {
                charge=70*3;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>300&&weight<=400)
            {
                charge=70*4;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>400&&weight<=500)
            {
                charge=70*5;
                System.out.println("Charge is Rs "+charge);
            }
            if (weight>500)
            {
                charge=65*6;
                System.out.println("Charge is Rs "+charge);
            }
        }
    }
}