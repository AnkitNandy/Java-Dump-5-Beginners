/**This program is to obtain a value 
 * randomly between 1 and 6
 * while rolling a dice
 * having six faces.
 */
public class Dice_Rolled
{
    public static void main()
    {
        System.out.println("A dice with 6 faces is there.");
        System.out.println("It has values from 1 to 6.");
        System.out.println("Oh!!It has been rolled");
        System.out.println("Let us see what value appears randomly");
        System.out.println("Get Ready!!!!"+"\n"+"The number is:-");
        int r;
        r=(int)((Math.random()*6)+1);
        System.out.println(+r);
    }
}