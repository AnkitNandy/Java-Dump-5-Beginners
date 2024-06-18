/**WAP to accept a number, check and display whether
 * it is a Automorphic number or a Trimorphic number
 * or both. Print None otherwise.
 * 
 * A number n is called Automorphic, if its square 
 * ends with n. For instance 5 is an Automorphic
 * number because 5 square = 25, which ends with
 * 5, 25 is an Automorphic number because 
 * 25 square = 625 which ends with 25.
 * A number n is called Trimorphic, if its cube end
 * with n. For instance 4 is a Trimorphic number
 * because 4 cube = 64, which ends with 4. 9 is a
 * Trimorphic number because 9 cube = 729 which ends
 * with 9.
 */
import java.util.*;
class Auto_TriAuto_Number
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int a=num;
        int d=0,cnt=0;
        while (a!=0)
        {
            d=a%10;
            cnt++;
            a=a/10;
        }
        Auto_TriAuto_Number obj=new Auto_TriAuto_Number();
        boolean x=obj.Automorphic(num,cnt);
        boolean y=obj.Trimorphic(num,cnt);
        if (x==true && y==false)
        System.out.println("Automorphic");
        else if (x==false && y==true)
        System.out.println("Trimorphic");
        else if (x==true && y==true)
        System.out.println("Both Automorphic and Trimorphic");
        else
        System.out.println("None");
    }
    boolean Automorphic(int n,int cnt)
    {
        int square=n*n;
        int d=0,s=0;
        for (int i=0;i<cnt;i++)
        {
            d=square%10;
            s=s+(int)Math.pow(10,i)*d;
            square=square/10;
        }
        if (s==n)
        return true;
        else
        return false;
    }
    boolean Trimorphic(int n,int cnt)
    {
        int cube=n*n*n;
        int d=0,s=0;
        for (int i=0;i<cnt;i++)
        {
            d=cube%10;
            s=s+(int)Math.pow(10,i)*d;
            cube=cube/10;
        }
        if (s==n)
        return true;
        else
        return false;
    }
}