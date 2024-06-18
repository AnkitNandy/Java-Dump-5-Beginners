import java.util.*;
class Digit_Frequency
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        long num=sc.nextLong();
        long d=0;
        long n=num;
        int cnt=0;
        System.out.println("\nDIGIT       FREQUENCY");
        for (int i=0;i<=9;i++)
        {
            n=num;
            cnt=0;
            while (n!=0)
            {
                d=n%10;
                if (d==i)
                cnt++;
                n=n/10;
            }
            System.out.println("  "+i+"            "+cnt);
        }
    }
}