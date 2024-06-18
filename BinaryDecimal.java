import java.util.*;
class BinaryDecimal
{
    void Number(int n)
    {
        int a=n;
        int d=0,s=0;
        while (a!=0)
        {
            d = a%2;
            s = d+s;
            a = a/2;
        }
        System.out.println("\nBinary Equivalent of "+n+" : "+s);
    }
    void Number(long b)
    {
        long d=0;
        long m=b;
        int x=1,sum=0;
        while (m!=0)
        {
            d = m%10;
            if (d==1)
            sum = sum+x;
            x*=2;
            m = m/10;
        }
        System.out.println("\nDecimal Equivalent of "+b+" : "+sum);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        BinaryDecimal obj = new BinaryDecimal();
        System.out.println("Enter a Number to convert it into Binary Form:");
        int num=sc.nextInt();
        obj.Number(num);
        System.out.println("\nEnter a Binary Number to convert it into Decimal:");
        long bin=sc.nextLong();
        obj.Number(bin);
    }
}