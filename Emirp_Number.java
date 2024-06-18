import java.util.*;
class Emirp_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int cnt1=0,cnt2=0;
        int d=0,rev=0;
        int i;
        for (i=1;i<=num;i++)
        {
            if (num%i==0)
            cnt1++;
        }
        int n=num;
        while (n!=0)
        {
            d = n%10;
            rev= rev*10+d;
            n = n/10;
        }
        for (i=1;i<=rev;i++)
        {
            if (rev%i==0)
            cnt2++;
        }
        if (cnt1==2 && cnt2==2)
        System.out.println(num+" IS AN EMIRP NUMBER.");
        else
        System.out.println(num+" IS NOT AN EMIRP NUMBER !!");
    }
}