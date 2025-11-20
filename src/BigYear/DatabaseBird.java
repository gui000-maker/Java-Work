package BigYear;

import java.util.ArrayList;

public class DatabaseBird {
    ArrayList<Bird> birds;

    public DatabaseBird() {
        this.birds = new ArrayList<>();
    }

    private Bird searchBird(String inputName) {
        for (Bird bird : birds) {
            if (bird.getName().equals(inputName)) {
                return bird;
            }
        }
        return null;
    }

    public void addBird(String inputName, String inputLatinName) {
        Bird bird = searchBird(inputName);
        if (bird == null) {
            birds.add(new Bird(inputName, inputLatinName));
        } else {
            System.out.println("Bird already exists in the database.");
        }
    }

    public void addObservation(String birdName) {
        Bird bird = searchBird(birdName);
        if (bird != null) {
            bird.addObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void printAll() {
        for (int i = (birds.size() - 1); i >= 0; i--) {
            Bird bird = birds.get(i);
            System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
        }
    }

    public void printOne(String onebirdName) {
        Bird bird = searchBird(onebirdName);
        if (bird != null) {
            System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservations() + " observations");
        } else {
            System.out.println("Not a bird!");
        }
    }
}