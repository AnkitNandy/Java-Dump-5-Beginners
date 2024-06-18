//To convert a number into its Binary Equivalent
import java.util.*;
class BinaryForm
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number (integer) :");
        int num=sc.nextInt();
        System.out.println("\nConverting "+num+" to BINARY, we get:-");
        int n=num;
        int d=0;
        String s="";
        while (n!=0)
        {
            d=n%2;
            s=d+s;
            n=n/2;
        }
        System.out.println(s);
    }
}       