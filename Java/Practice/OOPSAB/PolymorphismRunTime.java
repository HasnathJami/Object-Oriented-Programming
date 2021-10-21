package oopsab.oopsab;

class AA{
    
    public void Intro()
    {
         System.out.println("I am class A");
    }
    
    
}


class BB extends AA{
    
     public void Intro()
     {
         System.out.println("I am class B");
     }
}


public class PolymorphismRunTime {
    
    public static void main(String[] args) {
        BB bb = new BB();
        bb.Intro();
    }
   
    
    
    
}
