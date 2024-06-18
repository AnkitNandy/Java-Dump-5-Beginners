import java.util.*;
class Employee_Function
{
    void Tax(String name,int income)
    {
        double t=0.0;
        if (income<=50000)
        t=0;
        else if (income<=100000)
        t = (10.0/100.0)*income;
        else if (income<=150000)
        t = 5000 + (20.0/100.0)*income;
        else
        t = 15000 + (30.0/100.0)*income;
        System.out.println();
        System.out.println("NAME OF THE EMPLOYEE : "+name);
        System.out.println("INCOME TAX TO BE PAID : Rs."+t);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of employee:");
        String n=sc.nextLine();
        System.out.println("Enter the income(salary) of "+n+"(in rs):");
        int i=sc.nextInt();
        Employee_Function obj = new Employee_Function();
        obj.Tax(n,i);
    }
}