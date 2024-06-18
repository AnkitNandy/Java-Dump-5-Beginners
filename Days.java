/*To find and display the no of days 
 * to their respective numbers
 */
 import java.util.*;
 public class Days
   {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int num;
         System.out.println("Enter number from 1 to 7 to find the day of the week:-");
         num=sc.nextInt();
         switch(num)
         {
             case 1:
             System.out.println("The day is:-Sunday");
             break;
             case 2:
             System.out.println("The day is:-Monday");
             break;
             case 3:
             System.out.println("The day is:-Tuesday");
             break;
             case 4:
             System.out.println("The day is:-Wednesday");
             break;
             case 5:
             System.out.println("The day is:-Thursday");
             break;
             case 6:
             System.out.println("The day is:-Friday");
             break;
             case 7:
             System.out.println("The day is:-Saturday");
             break;
             default:
             System.out.println("You have entered a wrong number!");
            }
        }
    }   