import java.util.*;
class Sort
{
    private int[] num;
    
    public Sort(int[] num)
    {
        this.num=num;

    }

    int result()
    {
        int temp=0;
        int m=this.num.length;
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<m;j++)
        
    {
        if(num[i]<num[j])
        {
            temp=num[i];
            num[i]=num[j];
            num[j]=temp;
        }
        }
        }
        for(int i=0;i<m;i++)
        {
            System.out.println(num[i]);

        } 
        return 0;
    }


}

class NumSort
{
public static void main(String[] args) 
{
Scanner sc= new Scanner(System.in);
int []num= new int[6]; 


System.out.println("Please Enter random Number ");
for(int i=0;i<=5;i++)
{
  num[i]=sc.nextInt();
} 


System.out.println("********************************************************************   ");
System.out.println("Sorted List Is");
Sort m1=new Sort(num);
m1.result();

}
}