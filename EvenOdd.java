import java.util.*;
public class EvenOdd
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num,rem;
        System.out.println("Enter a number:-");
        num=sc.nextInt();
        rem=num%2;
        String s;
        s=(rem==0)? "Even Number":"Odd Number";
        System.out.println(num+" is "+s);
    }
}