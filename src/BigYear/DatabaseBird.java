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
        sortByObservations();
        for (Bird bird : birds) {
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

    public void sortByObservations() {
        int biggestIndex = 0;
        for (int i = 0; i < birds.size() - 1; i++) {
            for (int j = 0; j < birds.size() - 1; j++) {
                if (Integer.parseInt(birds.get(j).getObservations()) > Integer.parseInt(birds.get(biggestIndex).getObservations())) {
                    System.out.println(birds.get(j).getObservations());
                    biggestIndex = j;
                }
                Bird temp = birds.get(i);
                birds.set(i, birds.get(biggestIndex));
                birds.set(biggestIndex, temp);
            }
        }
    }
}