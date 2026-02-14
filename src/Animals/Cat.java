package Animals;

public class Cat extends Animal {

    public Cat (String name) {
        super(name);
    }

    public Cat() {
            super("Cat");
    }

     void purr() {
        System.out.println(getName() + " purrs");
     }
}
