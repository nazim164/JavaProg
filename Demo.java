import java.util.*;
class Base
{
    private int x;
    public Base(int x)
    {
        this.x=x;
    }
    public int getA()
    {
        return this.x;
    }
}
class Derive extends Base
{
    private int y;
    public Derive(int x,int y)
    {
        super(x);
        this.y=y;
    }
    void display()
    {
        System.out.println("x =:"+this.getA()+"y= :"+y);
    }
}
class Demo
{
    public static void main(String args[])
    {
        Derive d1=new Derive(10,20);
        d1.display();
    }
}