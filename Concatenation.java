//Program to concatenate two different strings
import java.util.*;
public class Concatenation
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String first,second,third;
        System.out.println("Enter two characters,words,or sentences in two different lines to join them:-");
        first=sc.nextLine();
        second=sc.nextLine();
        third=first+second;
        System.out.println(third);
    }
}
        
        