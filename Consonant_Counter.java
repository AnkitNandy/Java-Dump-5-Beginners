/**Accept a word or a string. Count all
 * the letters excluding the vowels present
 * in the word or string and then try to
 * display the result.
 */
import java.util.*;
class Consonant_Counter
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word or a string :-");
        String s=sc.nextLine();
        System.out.println();
        int cnt=0;
        char c;
        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if (Character.isLetter(c))
            {
                if (c!='A'&&c!='a'&&c!='E'&&c!='e'&&c!='I'&&c!='i'&&c!='O'&&c!='o'&&c!='U'&&c!='u')
                cnt++;
            }
        }
        System.out.println("Number of consonants (letters excluding the vowels) =\n"+cnt);
    }
}
        