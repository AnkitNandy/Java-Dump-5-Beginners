import java.util.*;
class Disarium_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer to check if it is a Disarium Number:");
        int num=sc.nextInt();
        int d=0,cnt=0;
        int n=num;
        int s=0;
        while(n!=0)
        {
            d=n%10;
            cnt++;
            n=n/10;
        }
        n=num;
        while (n!=0)
        {
            d=n%10;
            s = s + (int)(Math.pow(d,cnt));
            cnt--; 
            n=n/10;
        }
        if (s==num)
        System.out.println(num+" IS A DISARIUM NUMBER.");
        else
        System.out.println(num+" IS NOT a Disarium Number !!");
    }
}