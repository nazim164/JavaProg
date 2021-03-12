import java.lang.*;
import java.util.*;
class Number
{
    int n;
    public Number(int n)
    {
        this.n=n;
    }
    int result()
    {
        int m=0;
        for(int i=1;i<=10;i++)
        {
            m=n*i;
            System.out.println(n+"*"+i+"="+m);
        }
        return m;
    }
    
}
class MULTI
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A No:");
        int n=sc.nextInt();
        Number n1=new Number(n);
        System.out.println("Multiply Is "+n+"="+n1.result());
    }
    
}