/**Mr Guha accumulates 3000 shares of a company. He has some shares of that company valuing 
 * Rs 10 which yield 10% dividend per annum and got Rs 2000 as dividend at end of year.To 
 * calculate no. of shares he has and how many shares to be purchased for his target.
 */
public class companymatters
{
    public static void main(String args[])
    {
        int totshares=3000;
        int anndivi=2000;
        int nv=10;
        int divper=10;
        int shares,remshares;
        System.out.println("Annual dividend is:-"+"\n"+anndivi);
        System.out.println("Nominal value is:-"+"\n"+nv);
        System.out.println("Dividend percent is:-"+"\n"+divper);
        shares=(anndivi*100)/(nv*divper);
        remshares=totshares-shares;
        System.out.println("Mr Guha has "+shares+" shares currently.");
        System.out.println("The number of shares he needs to fulfill his target is "+remshares);
}
}
