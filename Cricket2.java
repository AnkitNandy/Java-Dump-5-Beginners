/*Program that computes strike rate for a 
 * cricket batsman who has scored 113 runs
 * facing 144 balls.
 * Note:Strike Rate is the number of runs 
 * scored per 100 balls faced.
 * i.e., SR=[100 *runs]/BF where
 * BF is balls faced.
 */
import java.util.*;
public class Cricket2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("TO COMPUTE THE STRIKE RATE OF A CRICKET BATSMAN");
        int balls,runs;
        double sr;//sr is strike rate
        System.out.println("Enter the number of balls faced by the batsman:-");
        balls=sc.nextInt();
        System.out.println("Enter runs scored by batsman:-");
        runs=sc.nextInt();
        System.out.println("____________________________________________________________");
        sr=(100*runs)/balls;
        System.out.println("By scoring "+runs+" runs in "+balls+" balls,");
        System.out.println("the batsman's strike rate is:-"+"\n"+sr+".");
    }
}
       