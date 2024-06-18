//Pg 430 in Textbook
import java.util.*;
class CabService
{
    String taxino,name;
    int d,amt;
    CabService()
    {
        taxino="";
        d=0;
        name="";
        amt=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Taxi Number:");
        taxino = sc.next();
        System.out.println("Enter the Name of the Passenger:");
        name = sc.next();
        System.out.println("Enter the Distance Travelled in Kms (Who:");
        d = sc.nextInt();
    }
    void calculate()
    {
        if (d<=1)
        amt=25*d;
        else if (d<=5)
        amt=30*d;
        else if (d<=10)
        amt=d*35;
        else if (d<=20)
        amt=d*40;
        else
        amt=d*45;
    }
    void display()
    {
        System.out.println("\n\t\t\tBILL");
        System.out.println(" TAXI NO.       NAME        DISTANCE(KM)       BILL AMOUNT");
        System.out.println(taxino+"       "+name+"            "+d+"               Rs."+amt);
    }
    public static void main()
    {
        CabService obj = new CabService();
        obj.input();
        obj.calculate();
        obj.display();
    }
}