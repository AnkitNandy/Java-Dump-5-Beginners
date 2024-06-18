/**To input an integer
 * and then to remove
 * all the even digits 
 * from it.
 */
import java.util.*;
public class Even_Digit_Remover
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to remove all the even digits from it :-");
        int num=scan.nextInt();
        System.out.println();
        int d,a=0;
        while (num!=0)
        {
            d=num%10;
            if (d%2!=0)
            {
                a=a*10+d;
            }
            num=num/10;
        }
        int digit;
        int answer=0;
        while (a!=0)
        {
            digit=a%10;
            answer=answer*10+digit;
            a=a/10;
        }
        System.out.println("By removing all the Even Digits from this Number, we get =");
        System.out.println(answer);
    }
}