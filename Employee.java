import java.util.*;
class Employee
{
    int basic;String name;
    double da=0,ta=0,hra=0,pf=0,gs=0;
    public void calc()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of the employee:-");
        name=scan.nextLine();
        System.out.println("Enter the basic salary of "+name+":-");
        basic=scan.nextInt();
        System.out.println();
        if (basic>=20000)
        {
            da=basic*53/100;
            ta=basic*12/100;
            hra=basic*10/100;
            pf=basic*8/100;
        }
        else if (basic>=10000&&basic<20000)
        {
            da=basic*45/100;
            ta=basic*15/100;
            hra=basic*12/100;
            pf=basic*8/100;
        }
        else
        {
            da=basic*50/100;
            ta=basic*10/100;
            hra=basic*15/100;
            pf=basic*7/100;
        }
        gs=basic+da+ta+hra-pf;
    }
    public void display()
    {
        System.out.println("Name                          Basic Salary                              Gross Salary");
        System.out.println(name+"                         Rs."+basic+"                                     "+gs);
    }
    public static void main()
    {
        Employee obj=new Employee();
        obj.calc();
        obj.display();
    }
}
