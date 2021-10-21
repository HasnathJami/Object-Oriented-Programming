
package oopsab.oopsab;


 class Fruit
{
  public int price;
  public String size;
  
   public Fruit(int price,String size)
   {
       this.price=price;
       this.size=size;
   }  

}

class Mango extends Fruit{
    
    
    public Mango(int price,String size)
    {
         super(price,size);
    }
   
    
}



public class Inheritence {
    
    
    public static void main(String[] args) {
        
         Mango m=new Mango(400,"Medium");
      //  Mango m=new Mango();
        //Apple a=new Apple();
        
      // m.price=500;
      // m.size="Small";
       System.out.println(m.price+" "+m.size);
    }
    
    
    
}
