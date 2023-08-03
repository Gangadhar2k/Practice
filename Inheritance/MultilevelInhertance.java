package Inheritance;

class Parent1{
    int rollNo =2001028;
    String name = "Gangadhar";
    String clg = "P.S.R. Engineering Colege";

    public void m1(){

        System.out.println("I AM FROM PARENT");
        System.out.println("My Name is "+ name);
        System.out.println("My RollNo is "+ rollNo);
        System.out.println("My College Name is "+ clg);

    }
}

class Child1 extends Parent1{
    int age = 21;
    public void m2(){
        System.out.println("Geting Values From Inheritance.Parent");
        super.m1();
        System.out.println("My Age is "+ age);

    }
}

class Child2 extends Child1{
    String lang = "ReactJs";
    public void m3(){
        System.out.println("Geting Values From First Inheritance.Child");
        super.m2();
        System.out.println("My I am Expert in "+ lang);

    }
}

public class MultilevelInhertance {


    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.m3();
        c2.m2();
        c2.m1();
    }
}
