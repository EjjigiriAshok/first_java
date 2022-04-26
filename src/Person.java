public class Person {
    int age;
    float weight;
    float height;
    String name;

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 23;
        p1.weight = 67.8f;
        p1.height = 5.8f;
        p1.name = "Sureka";

        Person p2 = new Person();
        p2.age = 45;
        p2.height = 5.6f;
        p2.weight = 67.9f;
        p2.name = "charan";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.weight);
        System.out.println(p1.height);

        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.weight);
        System.out.println(p2.height);

    }

}
