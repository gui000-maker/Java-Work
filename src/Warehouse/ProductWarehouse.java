package Warehouse;

public class ProductWarehouse extends Warehouse {
    private final String name;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }

    public String getName() {
        return this.name;
    }
}
