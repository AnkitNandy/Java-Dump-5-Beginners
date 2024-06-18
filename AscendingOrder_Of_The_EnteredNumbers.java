/*To input 10 integers and
 * check whether the entered numbers
 * are in ascending order or not.
 */
import java.util.*;
public class AscendingOrder_Of_The_EnteredNumbers
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int num,n;
        int a=0,b=0;
        System.out.println("Enter ten integers to check if they are in ascending order :-");
        n=scan.nextInt();
        for (int i=1;i<=9;i++)
        {
            num=scan.nextInt();
            a++;
            if (n<=num)
            b++;
        }
        System.out.println();
        if (a==b)
        System.out.println("All these entered numbers are in ASCENDING ORDER.");
        else
        System.out.println("All these entered numbers are NOT IN ASCENDING ORDER.");
    }
}
                  