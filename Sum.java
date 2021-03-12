import java.lang.*;
import java.util.*;
class Digit
{
    int n;
    public Digit(int n)
    {
        this.n=n;
        
    }
    int result()
    {
        int sum=0;
        int m=0;
        while(n>0)
        {
            m=n%10;
            sum=sum+m;
            n/=10;
        }
        return sum;
    }
}
class Sum 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A no :");
        int n=sc.nextInt();
        Digit d1=new Digit(n);
        System.out.println("sum of digit is :"+n+"="+d1.result());

    }
}