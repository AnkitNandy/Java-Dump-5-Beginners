/**Define a class Bill that calculates the telephone Bill of a consumer
 * with the following description:
 * 
 * Instance Variables/Data Members:
 * int bno : Bill_Constructor number
 * String name : name of consumer
 * int call : Number of calls cosumed in a month
 * double amt : Bill_Constructor amount to be paid by the person
 * 
 * Methods/Member Functions:
 * Bill_Constructor() : constructor to initialize data members with
 *          default initial value
 * Bill_Constructor(.....) : parameterized constructor to accept
 *               Bill_Constructorno, name and no. of calls consumed.
 * Calculate() : to calculate the monthly telephone Bill_Constructor for a
 *               consumer as per the following conditions.....
 *               
 *               UNITS CONSUMED               RATE
 *               First 100 calls          Rs.0.60/call
 *               Next 100 calls           Rs.0.80/call
 *               Next 100 calls           Rs.1.20/call
 *               Above 300 calls          Rs.1.50/call
 * Fixed Monthly Rental applicable to  all consumers : Rs.125
 * Display() : To display the details
 * 
 * Create an object in the main() method and invoke the above function 
 * to perform the desired task.
 */
import java.util.*;
class Bill_Constructor
{
    static int bno,call;
    static String name;
    static double amt;
    Bill_Constructor()
    {
        bno = 0;
        call = 0;
        name = "";
        amt = 0.0;
    }
    Bill_Constructor(int a,String n,int b)
    {
        bno = a;
        name = n;
        call = b;
    }
    void Calculate()
    {
        if (call<=100)
        amt = 0.60 * call;
        else if (call<=200) 
        amt = (0.60*100) + (0.80*(call-100));
        else if (call<=300)
        amt = (0.60*100) + (0.80*100) + (1.20*(call-200));
        else
        amt = 1.50 * call;
    }
    void Display()
    {
        System.out.println();
        System.out.println("\tBill_Constructor");
        System.out.println("\nName of The Consumer : "+name);
        System.out.println("Bill_Constructor Number : "+bno);
        System.out.println("No. of calls consumed per month : "+call);
        System.out.println("Amount To Be Paid : Rs."+(int)amt);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the electricity consumer:");
        name = sc.next();
        System.out.println("Enter the Bill_Constructor number:");
        bno = sc.nextInt();
        System.out.println("Enter the number of calls made in a month:");
        call = sc.nextInt();
        Bill_Constructor obj = new Bill_Constructor(bno,name,call);
        obj.Calculate();
        obj.Display();
    }
}