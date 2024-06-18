/*To find the date entered from the keyboard
 * is valid or not.
 * INPUT:day=31, month=04, year=2018(Example)
 * Also display the date entered in this format:-
 * 29/02/2016
 */
import java.util.*;
public class Date_Validity
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int yr,mon,day;
        System.out.println("ENTERING DATE AND CHECKING ITS VALIDITY");
        System.out.println("Enter the year(Format:2056):-");
        yr=sc.nextInt();
        System.out.println("Enter the month(Format:02):-");
        mon=sc.nextInt();
        System.out.println("Enter the day of the month(Format:31):-");
        day=sc.nextInt();
        System.out.println("The date you mean is:-");
        System.out.println(day+"/"+mon+"/"+yr);
        if (yr%4==0)
        {
            if (mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
            {
                if (day<=31)
                System.out.println("Date entered by you is Valid.");
                else
                System.out.println("Sorry!!"+"\n"+"Date entered by you is Invalid.");
            }
            else if (mon==4||mon==6||mon==9||mon==11)
            {
                if (day<=30)
                System.out.println("Date entered by you is Valid.");
                else
                System.out.println("Sorry!!"+"\n"+"Date entered by you is Invalid.");
            }
            else if (mon==2)
            {
                if (day<=29)
                System.out.println("Date entered by you is Valid.");
                else
                System.out.println("Sorry!!"+"\n"+"Date entered by you is Invalid.");
            }
            else
            System.out.println("Month entered is Invalid,"+"\n"+"so dste entered by you is Invalid.");
        }
        else
        {
            if (mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
            {
                if (day<=31)
                System.out.println("Date entered by you is Valid.");
                else
                System.out.println("Sorry!!"+"\n"+"Date entered by you is Invalid.");
            }
            else if (mon==4||mon==6||mon==9||mon==11)
            {
                if (day<=30)
                System.out.println("Date entered by you is Valid.");
                else
                System.out.println("Sorry!!"+"\n"+"Date entered by you is Invalid.");
            }
            else if (mon==2)
            {
                if (day<=28)
                System.out.println("Date entered by you is Valid.");
                else
                System.out.println("Sorry!!"+"\n"+"Date entered by you is Invalid.");
            }
            else
            System.out.println("Month entered is Invalid,"+"\n"+"so date entered by you is Invalid.");
        }
    }
}