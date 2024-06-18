/**To accept a number from the user
 * and check whether the number
 * enterred is automorphic or not.
 * Automorphic means a no. which is contained in the last two digits of its square.
 */
import java.util.*;
public class Automorphic_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,num,cnt=0,digit,sq,lastdigits;
        System.out.println("AUTOMORPHIC OR NOT??");
        System.out.println("Automorphic means a no. which is contained in the last two digits of its square.");
        System.out.println();
        System.out.println("Enter a number:-");
        n=sc.nextInt();
        num=n;
        sq=n*n;
        while(n>0)
        {
            digit=n%10;
            cnt++;
            n=n/10;
        }
        lastdigits=(int)(sq%Math.pow(10,cnt));
        if (lastdigits==num)
        System.out.println(num+" is an Automorphic Number.");
        else
        System.out.println(num+" is not an Automorphic Number.");
    }
}