/**To display a random result
 * as "HEADS" or "TAILS"
 * while tossing a coin.
 */
public class Coin_Toss
{
    public static void main()
    {
        System.out.println("Toss a coin.");
        System.out.println("____________________________________________________________");
        System.out.println("Coin is tossed!!");
        int toss;
        toss=(int)(Math.random()*2);
        if (toss==0)
        System.out.println("Get Ready;"+"\n"+"It is HEADS");
        if (toss==1)
        System.out.println("Get Ready;"+"\n"+"It is TAILS");
    }
}
