import java.util.*;
class Base
{
    private int a,b;
    public Base(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int getA()
    {
        return this.a=a;
    }
    int getB()
    {
        return this.b=b;
    }
}
class Derive extends Base
{
    public Derive()
    {
        super(6,4);
    }
    public String toString()
    {
        return "a :"+this.getA()+"b :"+this.getB();
    }
    void display()
    {
        System.out.println("Addition of two no :" +(this.getA()+this.getB()));
        System.out.println("multiplication of two no :" +(this.getA()*this.getB()));
        System.out.println("substraction of two no : " +(this.getA()-this.getB()));

    }
}
class Add
{
    public static void main(String args[])
    {
        Derive d2=new Derive();
        System.out.println(d2);
        d2.display();        
    }
}
