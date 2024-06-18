/*Accept a string and then convert
 * it into the required case as
 * based upon the user's choice.
 */
import java.io.*;
class Case_Converter
{
    static void main()throws IOException
    {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string :-");
        String s=buf.readLine();
        System.out.println();
        char ch;
        do
        {
            System.out.println("Press 'a' to convert given string to Upper Case");
            System.out.println("Press 'b' to convert given string to Lower Case");
            System.out.println("Enter your choice :-");
            ch=(char)buf.read();
            if (ch!='a' && ch!='b')
            System.out.println("Wrong Choice!! Try Again...\n");
        }while (ch!='a' && ch!='b');
        System.out.println();
        switch (ch)
        {
            case 'a':
            System.out.println(s.toUpperCase());
            break;
            case 'b':
            System.out.println(s.toLowerCase());
            break;
        }
    }
}