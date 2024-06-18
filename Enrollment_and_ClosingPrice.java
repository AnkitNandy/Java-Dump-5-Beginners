/**Program that calculates the
 * purchase price as the
 * minimum of enrollment price
 * and closing price.
 * Use Math class.
 */
import java.util.*;
public class Enrollment_and_ClosingPrice
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        double enrollmentprice,closingprice;
        System.out.println("TO CALCULATE PURCHASE PRICE AS THE MINIMUM OF ENROLLMENT AND CLOSING PRICE");
        System.out.println("Enter enrollment price:-");
        enrollmentprice=sc.nextDouble();
        System.out.println("Enter closing price:-");
        closingprice=sc.nextDouble();
        double a;
        a=Math.min(enrollmentprice,closingprice);
        System.out.println("The purchase price is:-"+"\n"+"Rs "+a+".");
    }
}