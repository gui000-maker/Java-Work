package Animals;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    void bark() {
        System.out.println(getName() + " barks");
    }
}
