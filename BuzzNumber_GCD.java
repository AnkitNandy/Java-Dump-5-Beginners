/**Menu-driven program to accept a number from the user
 * and check whether it is 'BUZZ' Number or to
 * accept two numbers and print the GCD of them.
 * i) A BUZZ Number is the number which either ends with 7 or divisible by 7.
 *ii) GCD (Greatest Common Divisor) of two integers is calculated by 
 *     continued division method.
 *     Divide the larger number by the smaller; the remainder then divides the
 *     previous divisor. The process is repeated till the remainder is zero. 
 *     The divisor then results the GCD.
 */
import java.util.*;
public class BuzzNumber_GCD
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int num;
        int digit;
        int a,b;
        int gcd=0,product;
        System.out.println("Press '1' to check whether a number entered is a \"BUZZ\" NUMBER.");
        System.out.println("Press '2' to find the GREATEST COMMON DIVISOR (GCD) of two numbers.");
        System.out.println();
        System.out.println("Enter your choice :-");
        int choice=scan.nextInt();
        System.out.println();
        switch(choice)
        {
            case 1:
            System.out.println("Enter an integer to check if it is a Buzz Number :-");
            num=scan.nextInt();
            System.out.println();
            digit=num%10;
            if (digit==7 || num%7==0)
            System.out.println(num+" is A BUZZ NUMBER.");
            else
            System.out.println(num+" is NOT A BUZZ NUMBER.");
            System.out.println("The End!!");
            break;
            case 2:
            System.out.println("Enter two integers to find their Greatest Common Divisor(GCD) :-");
            a=scan.nextInt();
            b=scan.nextInt();
            System.out.println();
            product=a*b;
            for (int i=1;i<=product;i++)
            {
                if (a%i==0 && b%i==0)
                gcd=i;
            }
            System.out.println("Greatest Common Divisor of "+a+" and "+b+" = "+gcd);
            System.out.println("The End!!");
            break;
            default:
            System.out.println("Wrong Choice Entered!!!!!\nTry Again....");
        }
    }
}