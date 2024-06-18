import java.util.*;
class DataType
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter anything to find out its data type:");
        boolean a=sc.hasNextInt();
        if (a==true)
        System.out.println("\nInteger Data Type.");
        boolean b=sc.hasNextLong();
        if (b==true)
        System.out.println("\nLong Data Type.");
        boolean c=sc.hasNextFloat();
        if (c==true)
        System.out.println("\nFloat Data Type.");
        boolean d=sc.hasNextDouble();
        if (d==true)
        System.out.println("\nDouble Data Type.");
        boolean e=sc.hasNextBoolean();
        if (e==true)
        System.out.println("\nBoolean Data Type.");
        boolean f=sc.hasNextLine();
        if (f==true)
        System.out.println("\nString Data Type.");
        boolean g=sc.hasNext();
        if (g==true)
        System.out.println("\nCharacter Data Type.");
    }
}