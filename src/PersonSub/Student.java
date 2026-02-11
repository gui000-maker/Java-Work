package PersonSub;

public class Student extends Person {
    private int credits;

    public Student (String item, String local) {
        super(item, local);
    }

    public void study() {
        this.credits++;
    }

    public int credits() {
        return this.credits;
    }
}
