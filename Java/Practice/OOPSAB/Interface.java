
package oopsab.oopsab;


interface A{
    
    public void run();
    
}

class B implements A{

    @Override
    public void run() {
        System.out.println("I am running");
    }
      
    
}


public class Interface {
    
    public static void main(String[] args) {
        
        B b=new B();
        b.run();
    }
    
}
