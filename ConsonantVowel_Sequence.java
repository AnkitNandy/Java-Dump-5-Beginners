/**WAP to take a string as input and display the
 * string in the following format:
 * INPUT : MAN IS MORTAL
 * OUTPUT : MNA SI MRTLOA
 * (First consonants then vowels without
 * changing the sequence)
 */
import java.util.*;
class ConsonantVowel_Sequence
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.toUpperCase();
        s=s.trim();
        s=s+" ";
        String str="",a="";
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!=' ')
            str=str+s.charAt(i);
            else
            {
                for (int j=0;j<str.length();j++)
                {
                    char c1=str.charAt(j);
                    if (c1!='A' && c1!='E' && c1!='I' && c1!='O' && c1!='U')
                    a=a+c1;
                }
                for (int k=0;k<str.length();k++)
                {
                    char c2=str.charAt(k);
                    if (c2=='A'||c2=='E'||c2=='I'||c2=='O'||c2=='U')
                    a=a+c2;                    
                }
                a=a+" ";
                str="";
            }
        }
        System.out.println("New String :\n"+a);
    }
}