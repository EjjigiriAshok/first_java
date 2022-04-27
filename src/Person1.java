public class Person1 {
    private float weight;
    private float height;
    private int age;
    private String name;


    Person1(){
        this.height = 5.5f;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person1 p1 =new Person1();
        p1.setAge(53);
        p1.setName("Mallika");
        p1.setWeight(87.9f);
        p1.setHeight(5.6f);

        Person1 p2 =new Person1();
        p2.setAge(43);
        p2.setName("gotham");
        p2.setWeight(57.9f);
        p2.setHeight(5.6f);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println(p1.getWeight());

        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getHeight());
        System.out.println(p2.getWeight());

    }

}



