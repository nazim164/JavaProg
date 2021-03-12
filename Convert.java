import java.lang.*;
import java.util.*;
class Demo{
    int n;
    public Demo(int n)
    {
        this.n=n;
    }
    void result()
    {
        int a=1000;
        while(this.n>0)
        {
            switch(this.n/a)
            {
                case 1:
                System.out.println("one");
                break;
                case 2: 
                System.out.println("two");
                break;
                case 3:
                System.out.println("three");
                break;
                case 4:
                System.out.println("four");
                break;
                case 5:
                System.out.println("five");
                break;
                case 6:
                System.out.println("six");
                break;
                case 7:
                System.out.println("seven");
                break;
                case 8:
                System.out.println("eight");
                break;
                case 9:
                System.out.println("nine");
                break;
                case 10:
                System.out.println("ten");
                break;

            }
            this.n=this.n-(this.n/a)*a;
            a=a/10;
        }
    }
}
class Convert 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number");
        int n=sc.nextInt();
        Demo n1=new Demo(n);
        n1.result();

    }
}