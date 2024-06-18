/**To return a character from a given index
 * or an index from a given character
 * present in a given string.
 */
import java.util.*;
public class Character_Index
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        char choice;
        int index;
        char c;
        System.out.println("Enter a string:-");
        String str=sc.nextLine();
        System.out.println("Press 'a' to return a character from a given index in the string entered.");
        System.out.println("Press 'b' to return an index from a given character in the string entered.");
        System.out.println("Enter your choice:-");
        choice=sc.next().charAt(0);
        switch(choice)
        {
            case 'a':
            System.out.println("Enter the index of unknown character in the string:-");
            index=sc.nextInt();
            c=str.charAt(index);
            System.out.println();
            System.out.println("The character with index position "+index+" in the given string is:-");
            System.out.println(c);
            break;
            case 'b':
            System.out.println("Enter the character to find its index in the string:-");
            c=sc.next().charAt(0);
            index=str.indexOf(c);
            System.out.println();
            System.out.println("The index position of "+c+" is:-");
            System.out.println(index);
            break;
            default:
            System.out.println("Wrong Choice Entered!!"+"\n"+"Try Again.");
            System.exit(0);
        }
    }
}
