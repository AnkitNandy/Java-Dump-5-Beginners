/*To enter a character and
 * then check whether the character
 * entered is a digit(number),
 * an alphabet or a
 * special character.
 */
import java.util.*;
public class DigitOrLetterOrSpecialCharacter
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character of your choice:-");
        char c=sc.next().charAt(0);
        if (Character.isLetter(c)==true)
        System.out.println(c+" is an ALPHABET.");
        else if (Character.isDigit(c)==true)
        System.out.println(c+" is a DIGIT.");
        else 
        System.out.println(c+" is a SPECIAL CHARACTER.");
    }
}