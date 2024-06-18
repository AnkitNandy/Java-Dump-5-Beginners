/**Define a class Factor to input a number and a
 * character and print all the factors of a number
 * in ascending order if the character entered is 
 * 'A' or 'a'. If the character entered is 'D' or 
 * 'd', then print all the factors in descending
 * order. For any other character, the program 
 * should print an appropriate message.
 */
import java.util.*;
class Factor
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("\nPress 'A' or 'a' to print its factors in ascending order.");
        System.out.println("Press 'D' or 'd' to print its factors in descending order.");
        System.out.println("\nEnter your choice:");
        char ch=sc.next().charAt(0);
        int i;
        switch(ch)
        {
            case 'A':
            case 'a':
            System.out.println("\nFactors of "+num+" in ascending order :");
            for (i=1;i<=num;i++)
            {
                if (num%i==0)
                {
                    if (i==num)
                    System.out.print(i+".");
                    else
                    System.out.print(i+", ");
                }
            }
            break;
            case 'D':
            case 'd':
            System.out.println("\nFactors of "+num+" in descending order :");
            for (i=num;i>=1;i--)
            {
                if (num%i==0)
                {
                    if (i==1)
                    System.out.print(i+".");
                    else
                    System.out.print(i+", ");
                }
            }
            break;
            default:
            System.out.println("Wrong Choice Entered!!");
        }
    }
}