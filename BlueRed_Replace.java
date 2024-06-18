/**Accept a sample string 
 * and replace the word
 * 'blue' with 'Red'.
 * Display the output.
 */
import java.util.*;
class BlueRed_Replace
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string [This program is to replace the word(s) 'blue' with 'red']:-");
        String s=sc.nextLine();
        System.out.println();
        String str="",nstr="";
        s=s.trim();
        s=s+" ";
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c==' ')
            {
                if (str=="blue")
                nstr=nstr+" Red";
                else
                nstr=nstr+" "+str;
                str="";
            }
            else 
            {
                str=str+c;
            }
        }
        System.out.println("New String formed:\n"+nstr);
    }
}
            