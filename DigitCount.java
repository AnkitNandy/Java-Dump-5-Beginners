//To count the digits of an entered number
import java.util.*;
public class DigitCount
{
    int count,i;
    long num,n;
    Scanner sc=new Scanner(System.in);
    public void InputData()
    {
        System.out.println("TO COUNT THE NUMBER OF DIGITS PRESENT IN A GIVEN NUMBER");
        System.out.println();
        System.out.println("Enter an integral number :-");
        num=sc.nextLong();
    }
    public void Calculate()
    {
        n=num;
        count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
    }
    public void OutputData()
    {
        System.out.println();
        System.out.println("Number of digits present in "+num+" :-");
        System.out.println(count);
    }
    public static void main()
    {
        DigitCount object=new DigitCount();
        object.InputData();
        object.Calculate();
        object.OutputData();
    }
}