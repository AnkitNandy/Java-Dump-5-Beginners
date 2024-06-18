//To calculate the number of digits in a number
import java.io.*;
public class Digits
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int num;
        System.out.println("Enter a number without a decimal point:-");
        num=Integer.parseInt(in.readLine());
        if (num<10)
        System.out.println("It is a single digit number.");
        if (num>=10&&num<100)
        System.out.println("It is a two digit number.");
        if (num>=100&&num<1000)
        System.out.println("It is a three digit number.");
        if (num>=1000&&num<10000)
        System.out.println("It is a four digit number.");
        if (num>=10000&&num<100000)
        System.out.println("It is a five digit number.");
        if (num>=100000&&num<1000000)
        System.out.println("It is a six digit number.");
        if (num>=1000000&&num<10000000)
        System.out.println("It is a seven digit number.");
        if (num>=10000000&&num<100000000)
        System.out.println("It is an eight digit number.");
        if (num==0)
        System.out.println("Why?It is not a defined number!");
    }
}