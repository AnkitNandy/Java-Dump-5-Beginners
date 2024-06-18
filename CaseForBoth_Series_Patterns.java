import java.util.*;
public class CaseForBoth_Series_Patterns
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 'a' to find the sum of series: S = x square / 3! + x cube / 4! + x power4 / 5! + x power5 / 6! +.......+ x power'n' / (n+1)!");
        System.out.println("Press 'b' to generate a pattern.");
        System.out.println();
        char c;
        int i,j;
        int x,n;
        double s=0;
        System.out.println("Enter your choice out of 'a' or 'b':-");
        c=sc.next().charAt(0);
        switch(c)
        {
            case 'a':
            System.out.println("Enter the value of x:-");
            x=sc.nextInt();
            System.out.println("Enter the value of n:-");
            n=sc.nextInt();
            for(i=2;i<=n;i++)
            {
                int fact=1;
                for(j=1;j<=i+1;j++)
                {
                    fact=fact*j;
                }
                s=s+(double)((Math.pow(x,i))/fact);
            }
            System.out.println("The sum of the given series:-"+"\n"+s);
            break;
            case 'b':
            int a=1,b=1;
            System.out.println("The pattern is:-");
            for(i=1;i<=5;i++)
            {
                for(j=5;j>=i;j--)
                {  
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Choice Entered!!");
        }
    }
}
                    