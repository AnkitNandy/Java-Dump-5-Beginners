import java.util.*;
class Binary_Search
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int num[] = new int[50];
        System.out.println("Enter 10 numbers line by line in 'ascending order':-");
        for (int i=0;i<10;i++)
        num[i] = sc.nextInt();
        System.out.println("Enter a number which you would like to search from this list:-");
        int search = sc.nextInt();
        int low=0,high=9;
        int mid=0;
        int pos=-1;
        while (low<=high)
        {
            mid = (low+high)/2;
            if (search < num[mid])
            high = mid-1;
            else if (search > num[mid])
            low = mid+1;
            else
            {
                pos++;
                System.out.println("Special Number "+search+" is FOUND IN THE LIST.");
                System.out.println(search+" is at POSITION "+(mid+1)+" in your input.");
                break;
            }
        }
        if (pos == -1)
        System.out.println("Not a Special Number !!");
    }
}