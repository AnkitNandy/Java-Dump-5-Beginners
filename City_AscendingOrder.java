import java.util.*;
class City_AscendingOrder
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String c[]=new String[10];
        System.out.println("Enter the names of 10 cities line by line:");
        for (int i=0;i<10;i++)
        c[i]=sc.next();
        String swap="";
        for (int i=9;i>=0;i--)
        {
            for (int j=0;j<i;j++)
            {
                if (c[j+1].compareTo(c[j]) < 0)
                {
                    swap=c[j];
                    c[j]=c[j+1];
                    c[j+1]=swap;
                }
            }
        }
        System.out.println("\nCity names in Ascending Order:");
        for (int i=0;i<10;i++)
        System.out.println(c[i]);
    }
}