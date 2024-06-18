/**To find the position of 
 * the element to be seached
 * among the elements of an 
 * array sorted in descending
 * order as the user's input.
 */
import java.util.*;
class BinarySearch2
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("{72,44,38,13,9}\n");
        System.out.println("Enter the value which you wish to search in the array :-");
        int search=sc.nextInt();
        int n[]={72,44,38,13,9};
        int low=0,high=4,mid=0;
        int pos=-1;
        System.out.println();
        while (low<=high)
        {
            mid=(low+high)/2;
            if (search>n[mid])
            high=mid-1;
            else if (search<n[mid])
            low=mid+1;
            else if (search==n[mid])
            {
                pos++;
                break;
            }
        }
        if (pos>-1)
        System.out.println("Position of "+search+" in the array =\n"+(mid+1));
        else
        System.out.println(search+" is not found in the given array!!");
    }
}