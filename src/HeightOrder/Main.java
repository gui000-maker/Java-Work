package HeightOrder;

public class Main {
        static void main() {
            Room room = new Room();
            System.out.println("Empty room? " + room.isEmpty());
            room.add(new Person("Lea", 183));
            room.add(new Person("Kenya", 182));
            room.add(new Person("Auli", 186));
            room.add(new Person("Nina", 172));
            room.add(new Person("Terri", 185));
            System.out.println("Empty room? " + room.isEmpty());

            System.out.println();
            for (Person person : room.getPersons()) {
                System.out.println(person);
            }
        }
}
