import java.util.*;
public class Calculate
{
    int num,f,rev;
    Calculate(int n)
    {
        num=n;
        f=0;
        rev=0;
    }
    int prime()
    {
        int i,cnt=0;
        for (i=1;i<=num;i++)
        {
            if (num%i==0)
            cnt++;
        }
        if (cnt==2)
        return 1;
        else
        return 0;
    }
    int reverse()
    {
        int a=num;
        int rev=0,d=0;
        while (a!=0)
        {
            d=a%10;
            rev=rev*10+d;
            a=a/10;
        }
        return rev;
    }
    void display()
    {
        if (prime()==1 && reverse()==num)
        System.out.println("\nPrime Palindrome");
        else
        System.out.println("\nNot a prime palindrome number");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number=sc.nextInt();
        Calculate obj=new Calculate(number);
        obj.display();
    }
}