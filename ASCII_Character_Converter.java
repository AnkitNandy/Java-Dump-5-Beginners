/*To either convert an ASCII code into charater
 * or a character into ASCII code depending
 * upon the user's choice of method.
 */
import java.util.*;
public class ASCII_Character_Converter
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        char c;
        int ascii;
        System.out.println("Press 'a' to convert an ASCII code to character.");
        System.out.println("Press 'b' to convert a character to ASCII code.");
        System.out.println("Enter your choice:-");
        char choice=sc.next().charAt(0);
        switch(choice)
        {
            case 'a':
            System.out.println("Enter the ASCII Code:-");
            ascii=sc.nextInt();
            c=(char)(ascii);
            System.out.println();
            System.out.println("Character corresponding to ASCII Code-"+ascii+" is:-");
            System.out.println(c);
            break;
            case 'b':
            System.out.println("Enter the character:-");
            c=sc.next().charAt(0);
            ascii=(int)(c);
            System.out.println();
            System.out.println("ASCII Code of character "+c+" is:-");
            System.out.println(ascii);
            break;
            default:
            System.out.println("You have entered a WRONG CHOICE!!!");
            System.out.println("Try Again.");
            System.exit(0);
        }
    }
}