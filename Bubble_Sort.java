import java.util.*;
class Bubble_Sort
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers you wish to enter:");
        int a=sc.nextInt();
        System.out.println("Now enter "+a+" numbers to sort them in ascending order :-");
        int num[]=new int[a];
        int i,j;
        for (i=0;i<a;i++)
        num[i]=sc.nextInt();
        int swap;
        System.out.println("\nResult:");
        for (i=num.length-1;i>=0;i--)
        {
            for (j=0;j<i;j++)
            {
                if (num[j]>num[j+1])
                {
                    swap=num[j];
                    num[j]=num[j+1];
                    num[j+1]=swap;
                }
            }
        }
        for (i=0;i<num.length;i++)
        System.out.println(num[i]);
    }
}