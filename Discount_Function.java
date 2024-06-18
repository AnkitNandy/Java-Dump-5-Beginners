//pg 404 -> Question no. 8 in textbook
import java.util.*;
class Discount_Function
{
    int cost;
    String name;
    double dc,amt;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the List Price of the article (in Rs.) :");
        cost = sc.nextInt();
        System.out.println("Enter the Name of the Customer:");
        name = sc.nextLine();
    }
    void cal()
    {
        if (cost<=5000)
        dc=0;
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
        System.out.println("\n\tBILL");
        System.out.println("CUSTOMER NAME : "+name);
        System.out.println("COST PRICE : Rs."+cost);
        System.out.println("DISCOUNT GIVEN : Rs."+dc);
        System.out.println("PAYABLE AMOUNT : Rs."+amt);
    }
    public static void main()
    {
        Discount_Function obj = new Discount_Function();
        obj.input();
        obj.cal();
        obj.display();
    }
}