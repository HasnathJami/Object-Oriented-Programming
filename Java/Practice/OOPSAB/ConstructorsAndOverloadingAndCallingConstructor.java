package oopsab.oopsab;

class Per {

    int id;
    String name;

 
    
      public Per(int id, String name) {
           
          
        this.id = id;
        this.name = name;
    }
      
    public Per() {
        
        this(67,"Jami");

        System.out.println("I am a Constructor of the Person class");
    }
    
     


}

public class ConstructorsAndOverloadingAndCallingConstructor {

    public static void main(String[] args) {

        Per p = new Per();

        // Per p2 = new Per(67, "Hasnath");
        //  System.out.println(p2.id + " " + p2.name);
          System.out.println(p.id + " " + p.name);
    }

}
