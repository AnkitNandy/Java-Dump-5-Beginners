/**In equable triangle,area=perimeter.
 * Accept 3 sides of a triangle.
 * Find and display if it is equable or not.
 */
import java.util.*;
public class EquableTriangle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,s;
        double area,peri;
        System.out.println("Given, Triangle.");
        System.out.println("Enter three sides of triangle(positive):-");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        if (a<0||b<0||c<0)
        System.out.println("Wrong sides entered!!");
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        peri=a+b+c;
        if (area==peri)
        System.out.println("The triangle is equable.");
        else
        System.out.println("The triangle is not equable at all.");
    }
}
        