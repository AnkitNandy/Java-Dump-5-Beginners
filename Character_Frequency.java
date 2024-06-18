import java.util.*;
class Character_Frequency
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence in 'lower case':-");
        String s=sc.nextLine();
        int vowel=0,consonant=0,digit=0,ws=0,other=0;
        s=s.trim();
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (Character.isLetter(ch))
            {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                vowel++;
                else
                consonant++;
            }
            else if (Character.isDigit(ch))
            digit++;
            else if (Character.isWhitespace(ch))
            ws++;
            else
            other++;
        }
        System.out.println("\nFrequency of Vowels : "+vowel);
        System.out.println("Frequency of Consonants : "+consonant);
        System.out.println("Frequency of Digits : "+digit);
        System.out.println("Frequency of White Spaces : "+ws);
        System.out.println("Frequency of Other Symbols : "+other);
    }
}