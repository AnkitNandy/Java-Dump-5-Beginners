import java.util.*;
public class expression
{
    public static void main()
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer:");
        a=sc.nextInt();
        System.out.println("Enter second integer:");
        b=sc.nextInt();
        float x,y,z,max;
        x=a*a+b*b;//sum of their squares
        y=(a*a*a)/3;//average of first number's cubes
        z=(b*b*b)/3;//average of second number's cubes
        max=(a>b)? a:b;//maximum number
        System.out.println("The sum of their squares is: "+x);
        System.out.println("The average of first integer's cubes is: "+y);
        System.out.println("The average of second integer's cubes is: "+z);
        System.out.println("The maximum number is: "+max+"\n"+"Always Remember!!"+"\n"+"This is the END;");        
    }
}
        