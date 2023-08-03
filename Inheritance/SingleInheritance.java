package Inheritance;

class Parent{
    int a = 10;
    int b = 20;

    int c = a+b;
    public void m1() {
        System.out.println("addition of two Number is"+ c);
    }
}
class Child extends Parent{
      int d = 46+c;
      public void  m2(){
          System.out.println("Adding a value from Inheritance.Parent "+ d);
      }
}

    public static void main(String[] args)
public class SingleInheritance { {
        Child c = new Child();
        c.m2();
        c.m1();
    }
}
