abstract class ABS {
void display(){
    System.out.println("this is from display");
}
abstract  void show();
}
public class AbstractExample extends ABS{

    public void show(){
        System.out.println("from child class");
    }
    public void display(){
        System.out.println("from child2");
    }

    public static void main(String[] args) {
        ABS obj = new AbstractExample();
        obj.show();
        obj.display();
        obj.display();
    }
}
