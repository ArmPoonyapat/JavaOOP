package Inheritance2;

import java.util.ArrayList;

public class InventoryCart {
    private ArrayList<Product> items;
    private int capacity;

    public InventoryCart(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public void add(Product p) {
        if (items.size() < capacity) {
            items.add(p);
        } else {
            System.out.println("Cart is full!");
        }
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}