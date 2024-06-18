/**Write a menu-driven program for the following:
 * (a)To print the Floyd's Triangle
 *    1
 *    2   3
 *    4   5   6
 *    7   8   9   10
 *    11  12  13  14 15
 * (b)To display this pattern:
 *    I
 *    I C
 *    I C S 
 *    I C S E
 */
import java.util.*;
class CaseStringPattern2
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("(a)To print the floyd's triangle");
        System.out.println("(b)To print a pattern\n");
        System.out.println("Enter your choice out of 'a' or 'b':-");
        char choice=sc.next().charAt(0);
        System.out.println();
        switch(choice)
        {
            case 'a':
            System.out.println("FLOYD'S  TRIANGLE ??\n");
            int p=1;
            for (int i=1;i<=5;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print(p+"  ");
                    p++;
                }
                System.out.println();
            }
            break;
            case 'b':
            System.out.println("PATTERN WITH ICSE ??\n");
            String s="ICSE";
            for (int i=0;i<s.length();i++)
            {
                for (int j=0;j<=i;j++)
                {
                    System.out.print(s.charAt(j)+" ");
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Choice Entered!!!\nTry Again....");
        }
    }
}