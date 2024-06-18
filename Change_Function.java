/**Accept a string from the user.
 * Pass the string to function Change
 * which displays the 1st character of
 * each word after changing the case.
 */
import java.util.*;
class Change_Function
{
    void Change(String str)
    {
        str=str.trim();
        str=" "+str;
        System.out.println("\nFirst character of each word in reversed case:");
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if (i==str.length()-1)
            break;
            char c=str.charAt(i+1);
            if (ch==' ')
            {
                if (Character.isUpperCase(c))
                System.out.println(Character.toLowerCase(c));
                else
                System.out.println(Character.toUpperCase(c));
            }
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        Change_Function obj = new Change_Function();
        obj.Change(s);
    }
}