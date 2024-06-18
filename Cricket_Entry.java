import java.util.*;
class Cricket_Entry
{
    String name;
    long MNo;
    int A,M,C,TAmt;
    Cricket_Entry()
    {
        MNo=0;
        A=0;
        M=0;
        C=0;
        TAmt=0;
        name="";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the head person for the group:-");
        name=sc.nextLine();
        System.out.println("Enter the mobile number of "+name+" :-");
        MNo=sc.nextLong();
        System.out.println("Enter the number of persons above 12 years:");
        A=sc.nextInt();
        System.out.println("Enter the number of persons between 6 and 12 years:");
        M=sc.nextInt();
        System.out.println("Enter the number of children who are 5 or below:");
        C=sc.nextInt();
    }
    void amount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the type of class in which you want to go?");
        System.out.println("Press '1' for First Class");
        System.out.println("Press '2' for Second Class");
        System.out.println("Press '3' for Third Class");
        int type=sc.nextInt();
        if (type==1)
        TAmt = A*500 + M*300 + C*0;
        else if (type==2)
        TAmt = A*300 + M*200 + C*0;
        else
        TAmt = A*200 + M*100 + C*0;
    }
    void display()
    {
        System.out.println("\tENTRY RECEIPT");
        System.out.println("NAME OF HEAD : "+name);
        System.out.println("MOBILE NO. : "+MNo);
        System.out.println("TOTAL AMOUNT TO BE PAID : Rs."+TAmt);
        System.out.println("TOTAL NUMBER OF PERSONS : "+(A+M+C));
    }
    public static void main()
    {
        System.out.println("\tWELCOME TO THE CRICKET STADIUM");
        Cricket_Entry obj = new Cricket_Entry();
        obj.accept();
        obj.amount();
        obj.display();
    }
}