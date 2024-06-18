/**To accept two different characters 
 * and display the sum and difference
 * if their ASCII values.
 */
import java.util.*;
class ASCII_SumDifference
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two characters :-");
        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int sum=(int)a+b;
        int diff=(int)a-b;
        System.out.println();
        System.out.println("The sum of ASCII values of given characters = "+sum);
        System.out.println("The difference of ASCII values of given characters = "+diff);
    }
}