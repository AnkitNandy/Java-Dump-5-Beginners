/**WAP by accepting age and distance using Buffered Reader
  *to compute bus fare according to the following criteria:-
  *
  *Age(in years)    Distance(in kms)     Fare(in Rupees)
  *
  *Below 5           Any distance             Nil
  *
  *5 to 15            Below 20                Rs.5
  *                 From 20 to 100            Rs.15
  *                  Above 100                Rs.30
  *                  
  *More than 15       Below 20                Rs.10
  *  upto 60        From 20 to 100            Rs.50   
  *                   Above 100               Rs.100
  *  Above 60          Below 20                Nil
  *                 From 20 to 100            Rs.25
  *                  Above 100                Rs.70
  *                  
  * Print the age, distance in kms and the bus fare in
  * the following pattern :-
  * 
  *    Age               Distance(in Kms)           Bus Fare
  *   *****                *********km              Rs.*****
  */
import java.io.*;
class Bus
{
    public static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the age of the passenger:");
        int age=Integer.parseInt(buf.readLine());
        System.out.println("\nEnter the distance(in kms) travelled by bus:");
        int d=Integer.parseInt(buf.readLine());
        if (d>250)
        {
            System.out.println("Sorry, the bus cannot take the passenger to such a long distance!!\nSearch for a distance less than 250 Kms.\nSo Try Again.......");
            System.exit(0);
        }
        int fare=0;
        if (age<5)
        {
            fare=0;
        }
        else if (age>=5 && age<=15)
        {
            if (d<20)
            fare=5;
            else if (d>=20 && d<=100)
            fare=15;
            else
            fare=30;
        }
        else if (age>15 && age<=60)
        {
            if (d<20)
            fare=10;
            else if (d>=20 && d<=100)
            fare=50;
            else
            fare=100;
        }
        else
        {
            if (d<20)
            fare=0;
            else if (d>=20 && d<=100)
            fare=25;
            else
            fare=70;
        }
        System.out.println();
        System.out.println("  Age         Distance(in kms)        Bus Fare");
        System.out.println(age+"years            "+d+" Kms              Rs."+fare);
    }
}