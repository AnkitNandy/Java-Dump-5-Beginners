/*To compute the economy rate
 * for a cricket bowler who
 * bowled and made runs in
 * 4 overs. Input the runs
 * made by him in each over
 * and display the economy rate.
 * Economy rate is the average number
 * of runs conceded per over.
 */
import java.util.*;
public class Cricket1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int runs1,runs2,runs3,runs4,total;
        double econ;
        System.out.println("TO COMPUTE THE ECONOMY RATE FOR A CRICKET BOWLER IN FOUR OVERS");
        System.out.println("Enter runs made by bowler in first over:-");
        runs1=sc.nextInt();
        System.out.println("Enter runs made by bowler in second over:-");
        runs2=sc.nextInt();
        System.out.println("Enter runs made by bowler in third over:-");
        runs3=sc.nextInt();
        System.out.println("Enter runs made by bowler in fourth over:-");
        runs4=sc.nextInt();
        total=runs1+runs2+runs3+runs4;
        econ=total/4;
        if (total>144)
        System.out.println("Wrong runs entered!!!");
        else
        {
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("Over1:"+runs1+" runs.");
        System.out.println("Over2:"+runs2+" runs.");
        System.out.println("Over3:"+runs3+" runs.");
        System.out.println("Over4:"+runs4+" runs.");
        System.out.println("Economy Rate is:-"+"\n"+econ);
        }
    }
}