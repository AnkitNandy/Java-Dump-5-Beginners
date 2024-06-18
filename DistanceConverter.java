/**Program that receives the distance
 * in metres or centimetres and then
 * converts it into the other unit.
 */
import java.util.*;
public class DistanceConverter
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        double dist1,dist2;//distance in m or cm.
        System.out.println("Welcome to The Distance Converter!!");
        System.out.println("1. TO CONVERT METER TO CENTIMETER");
        System.out.println("2. TO CONVERT CENTIMETER TO METER");
        System.out.println("Press 1 or 2 to perform any one of these tasks.");
        System.out.println("Enter your choice here:-");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println();
            System.out.println("Meter to Centimeter??");
            System.out.println("Enter distance in meters:-");
            dist1=sc.nextFloat();
            dist2=dist1*100.0;
            System.out.println(dist1+" m to cm is:"+"\n"+dist2+" cm.");
            break;
            case 2:
            System.out.println();
            System.out.println("Centimeter to Meter??");
            System.out.println("Enter distance in centimetres:-");
            dist1=sc.nextFloat();
            dist2=dist1/100.0;
            System.out.println(dist1+" cm to m is:"+"\n"+dist2+" m.");
            break;
            default:
            System.out.println("Wrong Choice Entered!!!!");
            System.out.println("You must enter either 1 or 2.");
        }
    }
}