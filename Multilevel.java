import java.util.*;
 class Base
 {
     private int a;
     public Base(int a)
     {
         this.a=a;
     }
     public int demo()
     {
         return this.a;
     }
 }
 class Derive extends Base
 {
     private int b;
     public Derive(int a,int b)
     {
         super(a);
         this.b=b;
     }
     public int value()
     {
         return this.b;
     }
 }
 class Derived extends Derive
 {
     private int p;
      public Derived(int a,int b )
      {
          super(a,b);
          this.p=p;
      }
      public String toString()
      {
          return "a :"+this.demo()+"b :"+this.value();
      }
      void display()
      {
        p=2*value()+5*demo();
        System.out.println("================================================");
        System.out.println("the value of equation is "+p);

      }
 }
 class Multilevel
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter The Base Class Value");
         int a=sc.nextInt();
         System.out.println("Enter The Derive Class Value");
         int b=sc.nextInt();
         Derived d1=new Derived(a,b);
         d1.display();
         
     }
}
