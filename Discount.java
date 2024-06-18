import java.util.*;
class Discount
{
    int cost;
    String name;
    double dc,amt;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the customer:");
        name=sc.nextLine();
        System.out.println("Enter the cost of the article to be bought:");
        cost=sc.nextInt();
        System.out.println();
    }
    void cal()
    {
        if (cost<=5000)
        dc = 0;
        else if (cost<=10000)
        dc = (10.0/100.0)*cost;
        else if (cost<=15000)
        dc = (15.0/100.0)*cost;
        else
        dc = (20.0/100.0)*cost;
        amt = cost-dc;
    }
    void display()
    {
        System.out.println("\t\t!@#$%^&*BILL*&^%$#@!");
        System.out.println("NAME OF CUSTOMER        COST        DISCOUNT        PAY");
        System.out.println("_______________________________________________________");
        System.out.println(name+"                   "+cost+"         Rs."+dc+"        Rs."+amt);
    }
    public static void main()
    {
        Discount obj = new Discount();
        obj.input();
        obj.cal();
        obj.display();
    }
}