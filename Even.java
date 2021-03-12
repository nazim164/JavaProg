import java.util.*;
class Even
{
    public static void main(String args[])

    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any No");
        num=sc.nextInt();
        if(num%2==0)
        System.out.println("no is even");
        else
        System.out.println("no is odd");

    }
}