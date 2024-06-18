/**To input an integer and check whether it is an
 * automorphic, trimorphic or tri-automorphic number
 * or not. A number n is said to be automorphic if its
 * square ends in n. For instance 5 is automorphic,
 * because 25 square = 625, which ends in 25.
 * A number n is called trimorphic if the cube of n
 * ends in n. For example: 49 cube = 117649, is trimorphic.
 * A number n is called tri-automorphic if 3n square ends in n;
 * for example: 667 is tri-automorphic because 3 x 667 square = 1334667,
 * ends in 667.
 */
import java.util.*;
public class Automorphic_Trimorphic_TriAutomorphic_Number
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer :-");
        int num=scan.nextInt();
        int square=num*num;
        int count1=0;
        int s1=0,d1;
        int n1=num;
        while (n1!=0)
        {
            d1=n1%10;
            count1++;
            n1=n1/10;
        }
        for (int i=0;i<count1;i++)
        {
            d1=square%10;
            s1=s1+(int)Math.pow(10,i)*d1;
            square=square/10;
        }
        if (s1==num)
        System.out.println(num+" is an AUTOMORPHIC NUMBER.");
        else
        System.out.println(num+" is NOT AN AUTOMORPHIC NUMBER.");
        int n2=num;
        int cube=num*num*num;
        int count2=0;
        int s2=0,d2;
        while (n2!=0)
        {
            d2=n2%10;
            count2++;
            n2=n2/10;
        }
        for (int j=0;j<count2;j++)
        {
            d2=cube%10;
            s2=s2+(int)Math.pow(10,j)*d2;
            cube=cube/10;
        }
        if (s2==num)
        System.out.println(num+" is A TRIMORPHIC NUMBER.");
        else
        System.out.println(num+" is NOT A TRIMORPHIC NUMBER.");
        int n3=num;
        int p=3*num*num;
        int count3=0;
        int s3=0,d3;
        while (n3!=0)
        {
            d3=n3%10;
            count3++;
            n3=n3/10;
        }
        for (int k=0;k<count3;k++)
        {
            d3=p%10;
            s3=s3+(int)Math.pow(10,k)*d3;
            p=p/10;
        }
        if (s3==num)
        System.out.println(num+" is A TRI-AUTOMORPHIC NUMBER.");
        else
        System.out.println(num+" is NOT A TRI-AUTOMORPHIC NUMBER.");
    }
}