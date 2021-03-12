import java.util.*;
class Sub
{
    private String str;
    public Sub(String str)
    {
        this.str=str;
    }
    public String toString()
    {
        return this.str;
    }

}

public  class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Sub arr1[]=new Sub[3];
        Sub arr2[]=new Sub[4];
        int vc1=0,vc2=0;
        String str1="",str2="";
        System.out.println("enter first string for array 1 :> ");
        for(int i=0;i<arr1.length;i++)
        {
            String m=sc.next();
            arr1[i]=new Sub(m);
             
            char ch=m.charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vc1=vc1+1;
                str1=str1+m+" ";
            }
            else
            {
                vc2=vc2+1;
                str2=str2+m+" ";
            }
        }
        System.out.println("===============================");

        System.out.println(" enter string for array 2 :>");
        for(int i=0;i<arr2.length;i++)
        {
            String n=sc.next();
            arr2[i]=new Sub(n);

            char ch=n.charAt(0);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vc1=vc1+1;
                str1=str1+n+" ";

            }
            else 
            {
                vc2=vc2+1;
                str2=str2+n+" ";
            }


        }

        System.out.println("***************************************");

        System.out.println("String start with vowel is : "+str1);
        System.out.println("Count of Vowel is : "+vc1);
        System.out.println("String start with Consonant is : "+str2);
        System.out.println("Count of Consonant is : "+vc2); 






    }
}