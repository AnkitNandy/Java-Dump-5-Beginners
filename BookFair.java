/**Define a class named BookFair with the 
 * following description :
 * 
 * Instance variables/data members:
 * String Bname - to store the name of the book
 * double price - to store the price of the book
 * Member Methods:
 * BookFair() - Default constructor to initialize 
 *              data members
 * void input() - To input and store the name and 
 *                the price of the book.
 * void calculate() - To calculate the price after
 *                    discount. Discount is 
 *                    calculated based on the 
 *                    following criteria :-
 *      PRICE                                     DISCOUNT
 * Less than or equal                            2% of price
 *     to Rs.1000                               
 * More than Rs.1000                             10% of price
 * More than Rs.3000                             15% of price
 * 
 * void display() - To display the name and price of 
 *                  the book after discount.
 * Write a main method to create an object of the class
 * and call the above member methods.
 */
import java.util.*;
class BookFair
{
    String Bname;
    double price;
    BookFair()
    {
        Bname="";
        price=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book:");
        Bname=sc.nextLine();
        System.out.println("\nEnter its price:");
        price=sc.nextDouble();
    }
    void calculate()
    {
        if (price<=1000)
        price-=(2.0/100.0)*price;
        else if (price>1000 && price<=3000)
        price-=(10.0/100.0)*price;
        else
        price-=(15.0/100.0)*price;
    }
    void display()
    {
        System.out.println("\nName of the book : "+Bname);
        System.out.println("\nAfter discount,\nprice of the book : Rs."+price);
    }
    static void main()
    {
        BookFair obj=new BookFair();
        obj.input();
        obj.calculate();
        obj.display();
    }
}