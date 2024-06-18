class Co_Prime
{
    static void main(int a,int b)
    {
        int cnt=0;
        for (int i=2;i<=a;i++)
        {
            if (a%i==0 && b%i==0)
            cnt++;
        }
        if (cnt==0)
        System.out.println(a+" and "+b+" are Co-Prime.");
        else
        System.out.println(a+" and "+b+" are NOT Co-Prime.");
    }
}