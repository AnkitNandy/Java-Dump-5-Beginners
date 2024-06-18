import java.util.*;
class Case_Pattern
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 'a' to print the first pattern.");
        System.out.println("Press 'b' to print the second pattern.");
        System.out.println("\nEnter your choice:");
        char ch=sc.next().charAt(0);
        int i,j,k;
        switch(ch)
        {
            case 'a':
            String w="BLUEJ";
            System.out.println("\nThe pattern is:");
            for (i=0;i<4;i++)
            {
                String s=w.substring(i,w.length())+w.substring(0,i);
                for (j=0;j<s.length();j++)
                {
                    System.out.print(s.charAt(j)+" ");
                }
                System.out.println();
            }
            break;
            case 'b':
            char c='A';
            for (i=1;i<=5;i++)
            {
                for (k=4;k>=i;k--)
                {
                    System.out.print(" ");
                }
                for (j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                }
                c++;
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Choice Entered!!!\nTry Again...");
        }
    }
}