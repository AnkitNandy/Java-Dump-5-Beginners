/**A menu-driven program to calculate:
 * 1.Area of a circle
 * 2.Area of a square
 * 3.Area of a rectangle
 * Enter 'c' to calculate area of circle, 
 * 's' to calculate a rea of square and
 * 'r' to calculate area of rectangle.
 */
import java.util.*;
public class CircleRectangleSquare_Area
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        char cal;//cal is the choice entered by user
        double rad,side,l,b,area;
        System.out.println("c for Area of Circle");
        System.out.println("s for Area of Square");
        System.out.println("r for Area of Rectangle");
        System.out.println("Press 'c','s' or 'r' to calculate them.");
        System.out.println("Enter your choice:-");
        cal=sc.next().charAt(0);
        switch(cal)
        {
            case 'c':
            System.out.println("Area of a circle?");
            System.out.println("Enter radius of the circle:-");
            rad=sc.nextDouble();
            area=(22.0/7.0)*rad*rad;
            System.out.println("Area of the circle is "+"\n"+area+" square units.");
            break;
            case 's':
            System.out.println("Area of a square?");
            System.out.println("Enter one equal side of the square:-");
            side=sc.nextDouble();
            area=side*side;
            System.out.println("Area of the square is "+"\n"+area+" square units.");
            break;
            case 'r':
            System.out.println("Area of a rectangle?");
            System.out.println("Enter length of rectangle:-");
            l=sc.nextDouble();
            System.out.println("Enter breadth of rectangle:-");
            b=sc.nextDouble();
            area=l*b;
            System.out.println("Area of the rectangle is "+"\n"+area+" square units.");
            break;
            default:
            System.out.println("Sorry, You have entered a wrong choice!!!");
            System.out.println("You must enter either 'c','s' or 'r'.");
        }
    }
}