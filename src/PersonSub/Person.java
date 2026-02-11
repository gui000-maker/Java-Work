package PersonSub;

public class Person {
    private final String item;
    private final String local;

    public Person(String item, String local) {
        this.item = item;
        this.local = local;
    }

    @Override
    public String toString() {
        return item + "\n  " + local;
    }
}
