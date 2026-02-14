package OnlineShop;

import java.util.Map;

public class Warehouse {
    private final Map<String, Integer> products = new java.util.HashMap<>();

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
    }

    public int price(String productName) {
        if (products.containsKey(productName)) {
            return products.get(productName);
        }
        return -99;
    }
}
