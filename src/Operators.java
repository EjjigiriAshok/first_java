public class Operators {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x =" +x);
        System.out.println("x++ =" +  x++);
        System.out.println("x =" +x);
        System.out.println("x-- =" +  x--);
        System.out.println("x =" +x);
        System.out.println("x%x =" +  x%x);
        System.out.println("x =" +x);

        int age=18;
        char gender= 'm';
        int x1=6;
        if (++age>=26 & gender=='m'){
            System.out.println("you are inside");
        } else{
            System.out.println("you are blocked");
        }

        int var = 13;
        if(var%2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

        System.out.println(var%2 == 0? "Even" : "Odd");


    }

}
