class Calculator
{
    private int result;
    Calculator()
    {
        result=0;
    }
    public void add(int a)
    {
        result=result+a;
    }
    public void sub(int a)
    {
        result=result-a;
    }
    public void mul(int a)
    {
        result=result*a;
    }
    public void div(int a)
    {
        result=result/a;
    }
    public void display()
    {
        System.out.println("Result of the calculation: "+result);
    }
    public void clear()
    {
        result=0;
    }
    public static void main(int a)
    {
        Calculator obj=new Calculator();
        obj.add(a);
        obj.sub(a);
        obj.mul(a);
        obj.div(a);
        obj.display();
        obj.clear();
    }
}