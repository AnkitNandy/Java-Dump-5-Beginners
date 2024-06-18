import java.util.*;
class ConsequtiveLetter
{
    void magic(String x)
    {
        x=x.trim();
        int cnt=0;
        for (int i=0;i<x.length();i++)
        {
            char ch=x.charAt(i);
            if (i==x.length()-1)
            break;
            char c=x.charAt(i+1);
            if (Character.isLetter(c) && Character.isLetter(ch))
            {
                if (ch==(char)(c+1) || c==(char)(ch+1))
                {
                    cnt++;
                    break;
                }
            }
        }
        if (cnt!=0)
        System.out.println("\nIt is a Magic String.");
        else
        System.out.println("\nIt is NOT a Magic String!!");
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        ConsequtiveLetter obj = new ConsequtiveLetter();
        obj.magic(s);
    }
}