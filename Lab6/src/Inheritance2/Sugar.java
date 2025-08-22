package Inheritance2;

public class Sugar extends Product {
    private int weight;

    public Sugar(int price) {
        super(price);
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sugar " + weight + " Gram  " + price;
    }
}