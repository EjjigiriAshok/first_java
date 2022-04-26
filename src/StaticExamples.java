public class StaticExamples {
    int a;
    static int b;

    public static void main(String[] args) {
        StaticExamples S1 = new StaticExamples();
        S1.a = 7 ;
        S1.b = 8;

        StaticExamples S2 = new StaticExamples();
        S2.a = 34 ;
        S2.b = 66;

        System.out.println("first object = " +S1.a);
        System.out.println("first object = " +S1.b);
        System.out.println("second object = " +S2.a);
        System.out.println("second object = " +S2.b);
    }
}
