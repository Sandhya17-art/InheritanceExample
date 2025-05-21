 interface A 
{
   void methodA();
}
 class Parent 
{
   public void methodB()
   {
     System.out.println("Class Parent method.");
   }
}
class Child extends Parent implements A
{
    public void methodA()
     {
        System.out.println("Inteface A method");
     }
     public void methodC()
     {
        System.out.println("Class Child method.");
     }

}
public class HybridInheritance 
{
   public static void main(String[] args)
   {
     Child obj = new Child();
       obj.methodA();
       obj.methodB();
       obj.methodC();
   }
}