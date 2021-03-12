// import java.lang.*;
import java.util.*;
class sorting{
    private String[] name;
    private int[] per;
    
    public sorting(String[] name, int[] per){
        this.name=name;
        this.per=per;
    }
    void name() {
        int temp1;
        int m=this.name.length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                    if(name[i].compareTo(name[j])>0){
                    String temp;
                    temp=name[i];
                    temp1=per[i];
                    name[i]=name[j];
                    per[i]=per[j];
                    name[j]=temp;
                    per[j]=temp1;
            }
        }
        }
        System.out.println("Sorted by name :");
        System.out.println("**************************************************************");
        for(int i=0;i<m;i++)
        {
            System.out.println("Name :"+ name[i]);
            System.out.println("Percentage :"+ per[i]);

        }
    }
   int number() {
        int temp1;
        int m=this.name.length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                    if(per[j]<per[i]){
                    String temp;
                    temp=name[i];
                    temp1=per[i];
                    name[i]=name[j];
                    per[i]=per[j];
                    name[j]=temp;
                    per[j]=temp1;
            }
        }
           }
           System.out.println("**************************************************************");

        System.out.println("Sorted by Percentage :");
        for(int i=0;i<m;i++)
        {
            System.out.println("Percentage:"+ per[i]);
            System.out.println("Name:"+ name[i]);

        }
        return 0;
    }
}




class Student{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String []name= new String[3]; 
         int  []per= new int[3]; 
        
        System.out.println(" Enter  name :");
        for(int i=0;i<3;i++)
        {
            name[i]=sc.nextLine();
        } 
        System.out.println(" Enter  Percentage :");
        for(int i=0;i<3;i++)
        {
            per[i]=sc.nextInt();
        } 
           
        sorting s=new sorting(name,per);
        s.name();
        s.number();
    }
}