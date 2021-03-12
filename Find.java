import java.util.*;
class First
{
    private int A;
    public First(int A)
    {
        this.A=A;
    }
    int getA()
    {
        return this.A=A;
    }
}
class Second extends First
{
    private int B;
    public Second(int A,int B)
    {
        super(A);
        this.B=B;
    }
    int getB()
    {
        return this.B;
    }
}
class Third extends Second
{
    private int C;
    public Third(int A,int B,int C)
    {
        super(A,B);
        this.C=C;
    }
    int getC()
    {
        return this.C;
    }
}
class Fourth extends Third
{
    private int D;
    public Fourth(int A, int B,int C ,int D)
    {
        super(A,B,C);
        // this.sum=sum;
        this.D=D;
    }
    public String toString()
    {
        return "A :"+this.getA()+"B :"+this.getB()+"C :"+this.getC()+"D :"+this.D;
    }
    void display()
    { 
     
        int sum=(this.getA()+this.getB()+this.getC()+this.D);
        System.out.println("Sum Of Four No :"+sum);
        int avg=(sum/4);
        System.out.println("Sum Of Average Is"+avg);

    }
    void demo()
    {
        if(getA()>getB() && getA()>getC()&& getA()>this.D)
        {
            System.out.println(getA()+"Is Greater");
        }
     else if(getB()>getA()&& getB()>getC() && getB()>this.D)
        {
            System.out.println(getB()+"Is Greater");
        }
        else if(getC()>getA()&& getC()>getB()&&getC()>this.D)
        {
            System.out.println(getC()+"Is Greater");
        }
        else if(this.D>getA() && this.D>getB() && this.D>getC())
        {
            System.out.println(this.D+"Is Greater");

        }

    }
    void result()
    {
        if(getA()<getB() && getA()<getC() && getA()< this.D)
        {
            System.out.println(getA()+"Is Lowest");
        }
        else if(getB()<getA() && getB()<getC() && getB()< this.D)
        {
            System.out.println(getB()+"Is Lowest");
        }
        else if(getC()<getA() && getC()<getB() && getC()< this.D)
        {
            System.out.println(getC()+"Is Lowest");
        }
        else if(this.D<getA() && this.D<getB() && this.D<getC())
        {
            System.out.println(this.D+"Is Lowest");

        }
    }
}
class Find
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Value");
        int A=sc.nextInt();
        System.out.println("Enter Second Value");
        int B=sc.nextInt();
        System.out.println("Enter Third Value");
        int C=sc.nextInt();
        System.out.println("Enter Four Value");
        int D=sc.nextInt();
        Fourth f1=new Fourth(A,B,C,D);
        System.out.println(f1);
        f1.display();
        f1.demo();
        f1.result();
    }
}
