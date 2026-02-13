package InterfaceInBox;

import java.util.ArrayList;

public class Box {
    private final ArrayList<Packable> items = new ArrayList<>();
    private final double maxWeight;
    private double currentWeight = 0;

    public Box (double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Packable item) {
        if (item.weight() > this.maxWeight) {
            return;
        }

        this.items.add(item);
        currentWeight += item.weight();
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.currentWeight + " kg";
    }
}
