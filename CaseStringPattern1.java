/**Generate a triangle or an
 * inverted triangle based
 * upon the user's choice.
 *          B                B L U E J
 *        L L                B L U E
 *      U U U                B L U
 *    E E E E                B L
 *  J J J J J                B
 */
import java.util.*;
class CaseStringPattern1
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to display triangular pattern\nPress 2 to display inverted triangular pattern");
        System.out.println("Enter your choice :-");
        int c=sc.nextInt();
        System.out.println("Enter a word to generate the pattern :-");
        String s=sc.next();
        System.out.println();
        switch(c)
        {
            case 1:
            System.out.println("OUTPUT:\n");
            for (int i=0;i<s.length();i++)
            {
                for (int k=s.length()-1;k>=i+1;k--)
                {
                    System.out.print("  ");
                }
                for (int j=0;j<=i;j++)
                {
                    System.out.print(s.charAt(i)+" ");
                }
                System.out.println();
            }
            break;
            case 2:
            System.out.println("OUTPUT:\n");
            for (int i=s.length()-1;i>=0;i--)
            {
                for (int j=0;j<=i;j++)
                {
                    System.out.print(s.charAt(j)+" ");
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("Wrong Choice Entered!!\nTry Again.");
        }
    }
}