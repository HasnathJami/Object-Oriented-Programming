
package oopsab.oopsab;


class Animal{
    
        protected static String domestic="YES";
        protected int price;
        protected int size;
        
    
    
}

class Dog extends Animal{
    
    
    
     public void activity()
     {
         System.out.println("The dog is barking");
     }
    
    
}

class Cat extends Animal{
    
     public void activity()
     {
         System.out.println("The cat is barking");
     }
    
    
}




public class Encapsulation {
    
    public static void main(String[] args) {
        Cat c=new Cat();
        
        c.price=200;
        c.size=10;
        
        System.out.println(Cat.domestic+" "+c.price+" "+c.size);
    }
    
}
