public class Constructor {
        Constructor(){
            System.out.println("this is from constructor");
        }
        Constructor(int a, float b){
            System.out.println("this is from constructor= " +(a+b) );
        }

    public static void main(String[] args) {
        Constructor c1= new Constructor();
        Constructor c2= new Constructor(3, 4.75f);
    }
}


