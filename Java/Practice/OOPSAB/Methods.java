
package oopsab.oopsab;


class Person{
    
    int id;
    String name;
    
    void activity()
    {
        System.out.println("The person is working");
    }
    
}



public class Methods {
    
    public static void main(String[] args) {
        Person p=new Person();
        p.id=1;
        p.name="Jishan";
        System.out.println(p.name+" "+p.id);
        p.activity();
    }
    
}
