/**Accept a string. Convert the
 * string to upper case. Count
 * and output the number of 
 * double letter sequences that
 * exist in the string.
 */
import java.util.*;
class DoubleLetterSequence_Counter
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s+" ";
        int cnt=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (Character.isLetter(c))
            {
                if (s.charAt(i+1)==c)
                cnt++;
            }
        }
        System.out.println("Number of double letter sequences:\n"+cnt);
    }
}