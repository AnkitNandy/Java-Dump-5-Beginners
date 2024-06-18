/**To check whether two strings 
 * entered by the user are equal
 * or not. The case of the two strings
 * may or may not be equal. 
 */
import java.util.*;
public class EqualStrings
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        char ch;
        System.out.println("TO CHECK IF TWO STRINGS ENTERED ARE EQUAL(UPPER AND LOWER CASE MAY NOT MATTER)");
        System.out.println();
        System.out.println("Enter the first string:-");
        s1=sc.nextLine();
        System.out.println("Enter the second string:-");
        s2=sc.nextLine();
        System.out.println("Press 'a' to check the equality of characters in the string and not their upper or lower case.");
        System.out.println("Press 'b' to check the equality of both characters and cases.");
        System.out.println();
        System.out.println("Enter your choice:-");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            if (s1.equalsIgnoreCase(s2))
            System.out.println(s1+" and "+s2+" are EQUAL STRINGS.");
            else
            System.out.println(s1+" and "+s2+" are NOT EQUAL STRINGS.");
            break;
            case 'b':
            if (s1.equals(s2))
            System.out.println(s1+" and "+s2+" are EQUAL STRINGS.");
            else
            System.out.println(s1+" and "+s2+" are NOT EQUAL STRINGS.");
            break;
            default:
            System.out.println("Wrong Choice Entered!!!"+"\n"+"Try Again.");
        }
    }
}