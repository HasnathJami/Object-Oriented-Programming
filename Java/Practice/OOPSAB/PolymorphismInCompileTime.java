package oopsab.oopsab;

class Person{
    
    int id;
    String name;
    
    void activity()
    {
        System.out.println("The person is working");
    }
    
    void activity(int hours)
    {
        System.out.println("The person is working for "+hours+" hours");
    }
    
}




public class PolymorphismInCompileTime {
    
    public static void main(String[] args) {
        
        Person p=new Person();
        p.id=1;
        p.name="Jishan";
        System.out.println(p.name+" "+p.id);
        p.activity();
        p.activity(12);
        
    }
    
}
