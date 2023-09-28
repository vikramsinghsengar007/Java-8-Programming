package com.interview.swiss;

public class A {
    public static void main(String[] args) {
    B b = new B();
    b.show1();
    B c = new C();
    c.show1();

        C c1 = new C();
        c1.show1();
    }
}

class B{
    public void show1(){
        System.out.println("b.show1()");
        show2();
    }
    public void show2(){
        System.out.println("b.show2()");
        show3();
    }
    public void show3(){
        System.out.println("b.show3()");
    }
}


class C extends B{
    public void show1(){
        System.out.println("c.show1()");
        show2();
    }
    public void show2(){
        System.out.println("c.show2()");
        show3();
    }
}