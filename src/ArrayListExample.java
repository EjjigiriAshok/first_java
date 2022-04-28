import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    static void ArrayFunction(){
        List<String> li = new ArrayList<String >();
        li.add("Harshada");
        li.add("Ashok");
        li.add("priyanka");

        for(String s:li){
            System.out.println("s ==" +s);
        }
        for(int i=0; i<li.size(); i++){
            System.out.println("li.get(i)= " +li.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayFunction();
    }

}
