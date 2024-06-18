/**Input a string. Convert the string to
 * upper case. Count and print the words
 * which have atleast a pair of
 * consequtive letters.
 */
import java.util.*;
class Consequtive_Pair
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :-");
        String s=sc.nextLine();
        System.out.println();
        s=s.trim();
        s=s.toUpperCase();
        s=s+" ";
        String str="";
        int cnt=0;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if (c!=' ')
            {
                str=str+c;
            }
            else
            {
                for (int j=0;j<str.length();j++)
                {
                    char ch=str.charAt(j);
                    if (ch==(char)(ch+1))
                    {
                        cnt++;
                        System.out.println(str);
                    }
                }
                str="";
            }
        }
        System.out.println("Number of words containing consequtive letters:\n"+cnt);
    }
}