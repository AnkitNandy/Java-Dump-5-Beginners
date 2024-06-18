/**WAP to store 17 numbers in an array and then display
 * all two digit numbers in ascending order and all one
 * digit numbers in descending order and also display 
 * the lowest two digit number and the highest single
 * digit number from the list.
 */
import java.util.*;
class Digit_Analyser
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[17];
        int i,j;
        System.out.println("Enter 17 numbers:");
        for (i=0;i<17;i++)
        arr[i] = sc.nextInt();
        int a=0,b=0;
        int arr1[] = new int[17];
        int arr2[] = new int[17];
        for (i=0;i<17;i++)
        {
            if (arr[i]>=1 && arr[i]<10)
            {
                arr1[a]=arr[i];
                a++;
            }
            if (arr[i]>=10 && arr[i]<100)
            {
                arr2[b]=arr[i];
                b++;
            }
        }
        int swap1=0;
        for (i=a;i>=0;i--)
        {
            for (j=0;j<i;j++)
            {
                if (arr1[j+1]>arr1[j])
                {
                    swap1 = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = swap1;
                } 
            }
        }
        int swap2=0;
        for (i=b;i>=0;i--)
        {
            for (j=0;j<i;j++)
            {
                if (arr2[j+1]<arr2[j])
                {
                    swap2 = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = swap2;
                } 
            }
        }
        int low = arr2[0];
        int high = arr1[0];
        System.out.println("\nOne Digit Numbers in Descending Order:");
        for (i=0;i<a;i++)
        System.out.print(arr1[i]+", ");
        System.out.println("\nTwo Digit Numbers in Ascending Order:");
        for (i=0;i<b;i++)
        System.out.print(arr2[i]+", ");
        System.out.println("\nLowest Two Digit Number = "+low);
        System.out.println("\nHighest One Digit Number = "+high);
    }
}