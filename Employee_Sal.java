//Pg 423 in textbook
import java.util.*;
class Employee_Sal
{
    String name,empno;
    int basic;
    double da,hra,pf,gross,net;
    Employee_Sal(String s,String n,int b)
    {
        name=s;
        empno=n;
        basic=b;
    }
    void compute()
    {
        da = (30.0/100.0)*basic;
        hra = (15.0/100.0)*basic;
        pf = (12.0/100.0)*basic;
        gross = basic+da+hra;
        net = gross-pf;
    }
    void display()
    {
        System.out.println("\nNAME : "+name);
        System.out.println("EMPLOYEE NO. : "+empno);
        System.out.println("\nGROSS SALARY : Rs."+gross);
        System.out.println("NET SALARY : Rs."+net);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of employee:");
        String x=sc.next();
        System.out.println("Enter employee number of "+x+" :");
        String y=sc.next();
        System.out.println("Enter basic salary:");
        int z=sc.nextInt();
        Employee_Sal obj=new Employee_Sal(x,y,z);
        obj.compute();
        obj.display();
    }
}