 interface I1 {
    default void show1(){
        System.out.println("show1");
    }
    static void show2(){
        System.out.println("show2");
    }
    void show();

    default  void display(){

    }
}
public class InterfaceExample implements I1 {

    @Override
    public void show() {
        System.out.println("from child class");
    }

    public static void main(String[] args) {
        I1 obj = new InterfaceExample();
        obj.show();
        obj.show1();
        I1.show2();
    }
}