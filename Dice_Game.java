/**A dice game is played between two players.
 * Each player throws a dice until his scores
 * add up to 20. The player with the minimum
 * number of throws is declared 'Winner'.
 */
//Pg 395 in textbook
import java.util.*;
class Dice_Game
{
    String name1,name2;
    int num1,num2;
    int s1=0,s2=0;
    int cnt1=0,cnt2=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the names of both the players line by line:");
        name1 = sc.next();
        name2 = sc.next();
        System.out.println("\nEnter the player number of "+name1+":");
        num1=sc.nextInt();
        System.out.println("Enter the player number of "+name2+":");
        num2=sc.nextInt();
    }
    void compute()
    {
        while (s1<=20)        
        {
            s1 = s1 + (int)(Math.random()*6)+1;
            cnt1++;
        }
        while (s2<=20)
        {
            s2 = s2 + (int)(Math.random()*6)+1;
            cnt2++;
        }
    }
    void display()
    {
        System.out.println();
        System.out.println("Loading the results.........");
        if (cnt1>cnt2)
        {
            System.out.println("WINNER : "+name1);
            System.out.println("         "+num1);
        }
        else if (cnt2>cnt1)
        {
            System.out.println("WINNER : "+name2);
            System.out.println("         "+num2);
        }
        else
        System.out.println("BOTH of You Are WINNERS");
    }
    public static void main()
    {
        Dice_Game obj = new Dice_Game();
        obj.input();
        obj.compute();
        obj.display();
    }
}