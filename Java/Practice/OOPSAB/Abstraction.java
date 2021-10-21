package oopsab.oopsab;

abstract class Parent {

     protected void activity() {
        System.out.println("I am active");
    }

      abstract void activity2();

}

class Child extends Parent {

    @Override
        void activity2() {
        System.out.println("I am new activity");
    }

}

public class Abstraction {

    public static void main(String[] args) {
        Child c = new Child();
        c.activity();
        c.activity2();

    }

}
