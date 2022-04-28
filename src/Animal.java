// abstract class
// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Dog implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The Dog says: bow bow");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Main1 {
    public static void main(String[] args) {
        Dog myDog= new Dog();  // Create a Dog object
        myDog.animalSound();
        myDog.sleep();
    }
}
