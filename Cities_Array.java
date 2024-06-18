/**WAP to accept the names of 10 cities in a single dimensional string array
 * and their STD (Subscribers Trunk Dialling) codes in another single 
 * dimension single array. Search for the name of the city along with its 
 * STD code, or else display the message "Search unsuccessful, no such city
 * in the list".
 */
import java.util.*;
class Cities_Array
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Given, 10 cities.\n");
        String city[]=new String[10];
        int std[]=new int[10];
        int i;
        for (i=0;i<city.length;i++)
        {
            System.out.println("Enter the name of a city:");
            city[i]=sc.next();
            System.out.println("Enter the STD (Subscribers Trunk Dialling) code of "+city[i]+":");
            std[i]=sc.nextInt();
            System.out.println();
        }
        System.out.println("_______________________________________________________________________________________");
        System.out.println("Now, enter a city name to be searched from your input:");
        String search=sc.next();
        int flag=0;
        for (i=0;i<city.length;i++)
        {
            if (search.equalsIgnoreCase(city[i]))
            {
                flag++;
                System.out.println("Search Successful");
                System.out.println("Name of the city: "+search);
                System.out.println("Its STD code: "+std[i]);
                break;
            }
        }
        if (flag==0)
        System.out.println("Search unsuccessful, no such city in the list!!");
    }
}