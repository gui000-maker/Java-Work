package Warehouse;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private final ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        addToWarehouse(initialBalance);
        history = new ChangeHistory();
        history.add(getBalance());
    }

    public String history() {
        return history.toString();
    }
}
