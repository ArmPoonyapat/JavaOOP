package Inheritance2;

public abstract class Product {
    protected int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // พวก subclass บางตัวใช้ weight บางตัวใช้ volume
    public void setWeight(int weight) {}
    public void setVolumn(int volumn) {}

    @Override
    public abstract String toString();
}