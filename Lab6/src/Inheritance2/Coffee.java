package Inheritance2;

public class Coffee extends Product {
    private int weight;

    public Coffee(int price) {
        super(price);
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Coffee " + weight + " Gram  " + price;
    }
}