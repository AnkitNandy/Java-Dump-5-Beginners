/**Store 10 words/names in a Single Dimensional Array.
 * Display only those words/names which begin with the
 * letter 'a' or 'A' and also end with the same letter(s).
 */
import java.util.*;
class BeginEnd_LetterA_Array
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ten (10) words/names:");
        String s[]=new String[10];
        int i;
        for (i=0;i<s.length;i++)
        {
            s[i]=sc.next();
            s[i]=s[i].trim();
        }
        System.out.println("\nWords or names which begin and end\nwith the letter 'a' or 'A':");
        for (i=0;i<s.length;i++)
        {
            char c1=s[i].charAt(0);
            char c2=s[i].charAt(s[i].length()-1);
            if (c1=='a'||c1=='A')
            {
                if (c2=='a'||c2=='A')
                {
                    System.out.println(s[i]);
                }
            }
        }
    }
}