//To input an integer and find the average of the sum of its digits
class Average_Of_Digits
{
    static void main(int n)
    {
        int d,sum=0,count=0;
        double avg=0;
        int num=n;
        while (n>0)
        {
            d=n%10;
            count++;
            sum=sum+d;
            n=n/10;
        }
        avg=(double)sum/count;
        System.out.println("Average of sum of digits of "+num+" = "+avg);
    }
}
