/**Accept any string. Count and print the number
 * of pairs of consecutive letters present in 
 * words in forward direction only. Assume that
 * all the letters in the string are in the same
 * case, consecutive letters in two different words
 * are not counted and 'za' or 'ZA' in any word is 
 * not a consecutive pair. For example :
 * Enter String:- ABSTRACT STRING IS BEING COUNTED 
 *                EDUCATIONALLY.
 * Output:- Pairs of consecutive letters - 3;
 */
import java.io.*;
class ConsecutivePair
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String :-");
        String s=buf.readLine();
        System.out.println();
        s=s.toUpperCase();
        s=s.trim();
        s=s+" ";
        char c,ch;
        int cnt=0;
        for (ch='A';ch<='Z';ch++)
        {
            for (int i=0;i<s.length();i++)
            {
                c=s.charAt(i);
                if ((c==ch) && (s.charAt(i+1)==(ch+1)))
                cnt++;
            }
        }
        System.out.println("Number of consecutive pairs =\n"+cnt);
    }
}