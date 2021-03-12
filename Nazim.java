import java.lang.*;
import java.util.*;
class Fact{
    int n;
    public Fact(int n1)
    {
        this.n=n1;
    }
    int result()
    {
        int f=1;
        while(this.n>0)
        {
            f*=this.n;
            this.n--;
        }
        return f;
    }
}
class Nazim
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entyer A No");
        int n=sc.nextInt();
        Fact f1=new Fact(n);
        System.out.println("Factorail of "+n+"="+f1.result());
    }
}