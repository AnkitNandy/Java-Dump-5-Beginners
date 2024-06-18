import java.util.*;
class BWSSB
{
    long RRno;
    String name;
    int consumption;
    double charge;
    BWSSB()
    {
        RRno=0;
        consumption=0;
        charge=0.0;
        name="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\tWELCOME TO BWSSB");
        System.out.println("Enter the name of the customer:");
        name = sc.nextLine();
        System.out.println("Enter the water meter number:");
        RRno = sc.nextLong();
        System.out.println("Enter the Water Consumption in Litres:");
        consumption = sc.nextInt();
    }
    double charge()
    {
        if (consumption<=8000)
        charge = 56;
        else if (consumption<=25000)
        charge = 11*(consumption/1000.0);
        else if (consumption<=50000)
        charge = 26*(consumption/1000.0);
        else
        charge = 30*(consumption/1000.0);
        return charge;
    }
    void display()
    {
        System.out.println("\n\t\t\t\tBILL");
        System.out.println("RR NUMBER      NAME     CONSUMPTION       CHARGE");
        System.out.println(RRno+"        "+name+"     "+consumption+" litres      Rs."+charge);
    }
    public static void main()
    {
        BWSSB obj = new BWSSB();
        obj.input();
        double d=obj.charge();
        obj.display();
    }
}