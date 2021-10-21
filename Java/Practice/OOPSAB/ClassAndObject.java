package oopsab.oopsab;

class Person {

    int id;
    String name;

}

public class ClassAndObject {

    public static void main(String[] args) {

        Person co = new Person();
        co.id = 1;
        co.name = "Jishan";

        System.out.println("Id is=" + co.id + " Name is=" + co.name);

    }

}
