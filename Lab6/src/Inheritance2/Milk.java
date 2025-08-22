package Inheritance2;

public class Milk extends Product {
    private int volumn;

    public Milk(int price) {
        super(price);
    }

    @Override
    public void setVolumn(int volumn) {
        this.volumn = volumn;
    }

    @Override
    public String toString() {
        return "Milk " + volumn + " CC     " + price;
    }
}