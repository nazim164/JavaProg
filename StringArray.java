import java.util.*;

class Add
{
    private String str;

    public Add(String str)
    {
        this.str=str;
    }

    public String toString()
    {
        return this.str;
    }

    // public void dis()
    // {
                   
    // }
    
}

public class StringArray
{ 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Add arr1[] = new Add[3];
        Add arr2[] = new Add[4];
        // Add merge[] = new Add[7];
        String str1="",str2="";
        int vc1=0,vc2=0;

       System.out.println("Enter String For Array 1 : ");
       for(int i=0; i<arr1.length; i++)
       {
            String m=sc.next();
            arr1[i]=new Add(m);   

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

       System.out.println("===========================");

       System.out.println("Enter String Array 2  : ");
       for(int i=0; i<arr2.length; i++)
       {
            String n=sc.next();
            arr2[i]=new Add(n);   

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