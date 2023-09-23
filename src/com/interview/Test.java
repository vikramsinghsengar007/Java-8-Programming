package com.interview;

class C {
}

class D extends C {
}

class A {
    public C getOBJ() {

        System.out.println("class A return C");

        return new C();
    }
}

class B extends A {
    public C getOBJ() {

        System.out.println("class B - return D");
        return new D();
    }
}

public class Test {

    public static void main(String args[]) {


        A a = new B();
        a.getOBJ();
    }
}