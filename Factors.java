//Program to input an integer and print all its factors
import java.util.*;
public class Factors
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to find its factors :-");
        int num=scan.nextInt();
        System.out.println();
        System.out.println("The factors of "+num+" are =");
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                if (i==num)
                System.out.print(i+".");
                else
                System.out.print(i+", ");
            }
        }
    }
}