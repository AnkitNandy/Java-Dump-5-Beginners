import java.util.*;
class Design
{
    void pattern(int a)
    {
        System.out.println("\nThe First Pattern is:");
        for (int i=a;i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void pattern(char x,char y)
    {
        System.out.println("\nThe Second Pattern is:");
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (i%2!=0)
                System.out.print(x+" ");
                else
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Design object = new Design();
        System.out.println("Enter an integer argument for first pattern:-");
        int num=sc.nextInt();
        object.pattern(num);
        System.out.println("\nEnter two character arguments for second pattern:-");
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        object.pattern(ch1,ch2);
    }
}