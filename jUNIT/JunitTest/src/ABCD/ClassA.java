package ABCD;

public class ClassA 
{
    private int a;
    private int b;
    private boolean c;
    
    public ClassA()
    {
        a = 0;
        b = 0;
        c = false;
    }
    
    public int Method1(int number)
    {
        if (number < 5)
        {
            a = number;
        }
        else if (number == 5)
        {
            a = 7;
        }
        else
        {
            a = 15;
        }
        return a;
    }
    
    public boolean Method2(int number)
    {
        System.out.println("a: " + a);
        b = number;
        if (b == a)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
