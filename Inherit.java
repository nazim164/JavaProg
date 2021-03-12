class MyBase  // Base Class
{
    private int a;
    private String b;
    public MyBase(int a,String b)
    {
        this.a=a;
        this.b=b;
    }
    
    public int getA()
    {
        return this.a;
    }
    public String getB()
    {
        return this.b;
    }

    public void f2()
    {
        System.out.println("I m in Base class f2");
    }


}


class MyDerive extends MyBase
{
    private int x;
    private String y;
    public MyDerive(int x,String y)
    {
        super(10,"Xyz"); // Base class Constructor
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return "A :"+this.getA()+" B :"+this.getB()+"x :"+this.x+"y :"+this.y;    
    }

    public void f1()
    {
        System.out.println("I m in derive class f1");
    }

}

class Inherit
{

public static void main(String [] args)
{
    MyDerive md=new MyDerive(5,"Abc");
    System.out.println(md);
    md.f1();
    md.f2();

}

} // Define Base Class

