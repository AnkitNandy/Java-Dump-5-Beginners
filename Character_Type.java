/**Accept a character. If it is a
 * letter, then display the case,
 * otherwise check whether it is a
 * digit or a special character.
 */
import java.util.*;
class Character_Type
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character :-");
        char c=sc.next().charAt(0);
        System.out.println();
        if (Character.isLetter(c))
        {
            if (Character.isLowerCase(c))
            System.out.println(c+" is a LOWER CASE ALPHABET.");
            else
            System.out.println(c+" is an UPPER CASE ALPHABET.");
        }
        else if (Character.isDigit(c))
        System.out.println(c+" is a DIGIT.");
        else
        System.out.println(c+" is a SPECIAL CHARACTER.");
    }
}