//Constructor
class Constructor1
{
    int id;
    Constructor1(int a)
    {
        id=a;
    }
    void display()
    {
        System.out.println(id);
        id=10;
    }
    public static void main()
    {
        Constructor1 s1=new Constructor1(2);
        Constructor1 s2=new Constructor1(3);
        s1.display();
        s1.display();
        s2.display();
    }
}