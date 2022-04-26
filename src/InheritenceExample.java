 class C {
    int a;
    Void show();
    {

         System.out.println("from show function");
     }
    
}
public abstract class InheritanceExample extends C {
    public abstract Void display();
    {
         System.out.println("display");
     }

     public static void main(String[] args) {
        C obj = new C();
        //obj.display();
        obj.show();  // this function is calling from same object so no inheritence
         InheritanceExample obj1 = new InheritanceExample();
         obj1.show(); // this is inheritence
     }
    
    
 }