package Lan7_2;

public class InventoryCart {
    private Product[] items;
    private int size;
    private int capacity;

    public InventoryCart(int capacity) {
        this.capacity = capacity;
        this.items = new Product[capacity];
        this.size = 0;
    }

    public void add(Product p) {
        if (size < capacity) {
            items[size++] = p;
        }
    }

    public Product[] getItems() {
        return items;
    }

    public int getSize() {
        return size;
    }
}
