/**A number is said to be DUCK if the digit zero(0)
 * is present in it. Accept a number and check whether
 * the  number is duck or not.(Number must not start with 0).
 */
import java.io.*;
class Duck_Number
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number :-");
        int num=Integer.parseInt(buf.readLine());
        System.out.println();
        int n=num;
        int d=0,c=0;      
        while (n!=0)
        {
            d=n%10;
            if (d==0)
            c++;
            n=n/10;
        }
        if (c>0)
        System.out.println(num+" is NOT A DUCK NUMBER.");
        else
        System.out.println(num+" is A DUCK NUMBER.");
    }
}
        